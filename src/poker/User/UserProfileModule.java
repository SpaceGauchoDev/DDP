/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.User;

import java.util.ArrayList;
import poker.Game.Game;
import poker.Modules;
import poker.UI.Player.PlayerModel;
import poker.UI.UserModel;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class UserProfileModule {
    private ArrayList<UserProfile> myRegisteredUsers = new ArrayList();

    public UserProfileModule() {
        
    }
    
    public boolean userExists(UserProfile aUser){
        return myRegisteredUsers.contains(aUser);
    }
    
    public boolean registerPlayer (String aId, String aPass, String aFullName, int aFunds){
        PlayerProfile player = new PlayerProfile(aId, aPass, aFullName, aFunds);
        if(player.isValid() && !userExists(player)){
            return myRegisteredUsers.add(player);
        }        
        return false;
    }
    
    public boolean registerAdmin (String aId, String aPass, String aFullName){
        AdminProfile admin = new AdminProfile(aId, aPass, aFullName);
        if(admin.isValid() && !userExists(admin)){
            return myRegisteredUsers.add(admin);
        }        
        return false;
    }
    
    // NOTE: Inefficient search algorithm
    public PlayerProfile getPlayerById (String aId){
        for(UserProfile u:myRegisteredUsers){
            if(u.getId().equals(aId) && u.getUserEnum() == UserProfileEnum.U_PLAYER ){
                return (PlayerProfile)u;
            }
        }
        return null;
    }
    
    // NOTE: Inefficient search algorithm
    public AdminProfile getAdminById (String aId){
        for(UserProfile u:myRegisteredUsers){
            if(u.getId().equals(aId) && u.getUserEnum() == UserProfileEnum.U_ADMIN ){
                return (AdminProfile)u;
            }
        }
        return null;
    }
    
    // NOTE: Handle by exeption candidate. 
    public PlayerModel loginPlayer(String aUsername, String aPassword){
        
        // Is player registered?
        PlayerProfile playerProfile = getPlayerById(aUsername);
        if(playerProfile!= null && playerProfile.getPassword().equals(aPassword)){
            Utils.logState("Registered player found.");
            int blindBetValue = Modules.getInstance().getGameModule().getBlindBetValue();
            
            // Can player pay the blind bet?
            if(playerProfile.getFunds() >=  blindBetValue){
                Utils.logState("Player id: "+ playerProfile.getId() +" just logged in.");
                Game game = Modules.getInstance().getGameModule().playerJoinAttempt(playerProfile);
                if(game != null ){
                    return game.getLocalPlayerModel(aUsername);
                    //PlayerModel playerModel = new PlayerModel(playerProfile.getId(), playerProfile.getFullName(), playerProfile.getFunds(), game.getId(), "", false);
                    //return playerModel;
                }
                else{
                    Utils.logState("Player unable to join a game, how did we get here?");
                    return null;
                }
                
            }else{
                Utils.logState("Player hasn't got enough funds to participate in a game.");
                return null;
            }
        }
        else{
            Utils.logState("No registered player found that matches the supplied credentials.");
            return null;
        }
    }
    
    public UserModel loginAdmin(String aUsername, String aPassword){
        
        // Is admin registred
        AdminProfile admin = getAdminById(aUsername);
        if(admin!= null && admin.getPassword().equals(aPassword)){
            Utils.logState("Admin id: "+ admin.getId() +" just logged in.");
            return new UserModel(admin.getId(), admin.getFullName());

            // TODO: Do admin on login stuff
        }
        return null;
    }
}
