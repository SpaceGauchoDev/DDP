/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.User;

import java.util.ArrayList;
import poker.Modules;
import poker.UI.PlayerModel;
import poker.UI.UserModel;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class UserModule {
    private ArrayList<User> myRegisteredUsers = new ArrayList();

    public UserModule() {
        
    }
    
    // TODO: repeated behaviour, do we need a generalization to handle lists?
    // add<SomeObject>()
    // <SomeObject>Exists()
    // get<SomeObject>ById()
    
    // Other suspect objects:
    // View.java
    // Component.java 
    public boolean userExists(User aUser){
        return myRegisteredUsers.contains(aUser);
    }
    
    public boolean registerPlayer (String aId, String aPass, String aFullName, int aFunds){
        Player player = new Player(aId, aPass, aFullName, aFunds);
        if(player.isValid() && !userExists(player)){
            return myRegisteredUsers.add(player);
        }        
        return false;
    }
    
    public boolean registerAdmin (String aId, String aPass, String aFullName){
        Admin admin = new Admin(aId, aPass, aFullName);
        if(admin.isValid() && !userExists(admin)){
            return myRegisteredUsers.add(admin);
        }        
        return false;
    }
    
    // NOTE: Inefficient search algorithm
    public Player getPlayerById (String aId){
        for(User u:myRegisteredUsers){
            if(u.getId().equals(aId) && u.getUserEnum() == UserEnum.U_PLAYER ){
                return (Player)u;
            }
        }
        return null;
    }
    
    // NOTE: Inefficient search algorithm
    public Admin getAdminById (String aId){
        for(User u:myRegisteredUsers){
            if(u.getId().equals(aId) && u.getUserEnum() == UserEnum.U_ADMIN ){
                return (Admin)u;
            }
        }
        return null;
    }
    
    // NOTE: Handle by exeption candidate. 
    public PlayerModel loginPlayer(String aUsername, String aPassword){
        
        // Is player registered?
        Player player = getPlayerById(aUsername);
        if(player!= null && player.getPassword().equals(aPassword)){
            Utils.logState("Registered player found.");
            int blindBetValue = Modules.getInstance().getGameModule().getBlindBetValue();
            
            // Can player pay the blind bet?
            if(player.getFunds() >=  blindBetValue){
                Utils.logState("Player id: "+ player.getId() +" just logged in.");
                PlayerModel playerModel = new PlayerModel(player.getId(), player.getFullName(), player.getFunds());
                boolean joinAttempt = Modules.getInstance().getGameModule().playerJoinAttempt(player);
                
                if(joinAttempt){
                    return playerModel;
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
        Admin admin = getAdminById(aUsername);
        if(admin!= null && admin.getPassword().equals(aPassword)){
            Utils.logState("Admin id: "+ admin.getId() +" just logged in.");
            return new UserModel(admin.getId(), admin.getFullName());

            // TODO: Do admin on login stuff
        }
        return null;
    }
}
