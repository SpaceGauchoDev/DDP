/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Player;
import poker.UI.Framework.Controller;
import poker.UI.Framework.View;
import poker.UI.ViewEnum;
import poker.Utils;
/**
 *
 * @author MDA 174321 :)
 */
public class PlayerController extends Controller {
    PlayerModel myLocalPlayer;
    PlayerView myPlayerView;
    
    int myCurrentMinBet = 0;    // TODO: get real values
    int myCurrentMaxBet = 20;   // TODO: get real values
    
    public PlayerController(View aView, ViewEnum aViewEnum, PlayerModel aPlayer) {
        super(aView, aViewEnum);
        myLocalPlayer = aPlayer;
        setTitleUnlocalized(myLocalPlayer.getFullName());
        
        if (aView instanceof PlayerView){
            myPlayerView = (PlayerView)aView;
        }
    }
    
    //Stage 1 and player wants to make a bet
    public void playerBets(String aBet){
        Utils.logState("Player id: "+ myLocalPlayer.getId() +" tried to start a bet.");
        try
        {
            int aNumericBet = Integer.parseInt(aBet);
            if(aNumericBet >= myCurrentMinBet && aNumericBet<=myCurrentMaxBet){
                Utils.logState("Player id: "+ myLocalPlayer.getId() +" bet is valid.");
                
                // do bet here
                myPlayerView.clearWarning();
            }else{
                Utils.logState("Player id: "+ myLocalPlayer.getId() +" bet was out of valid range.");
                myPlayerView.setInvalidBetRangeWarning();
            }
        }
        catch (NumberFormatException ex)
        {
            Utils.logState("Player id: "+ myLocalPlayer.getId() +" bet was not a number.");
            myPlayerView.setInvalidBetDataTypeWarning();
        }
    }
    
    //Stage 1 and player wants to pass
    public void playerPassFirst(){
        Utils.logState("Player id: "+ myLocalPlayer.getId() +" passes starting a bet.");
    }
    
    //Stage 2 and player wants to call other player's bet
    public void playerCalls(){
        Utils.logState("Player id: "+ myLocalPlayer.getId() +" calls other player's bet.");
        
    }
    
    //Stage 2 and player wants to pass on other player's bet
    public void playerPassSecond(){
        Utils.logState("Player id: "+ myLocalPlayer.getId() +" folds on bet another player's bet.");
        
    }
    
    //Stage 3 and player wants to continue game
    public void playerWantsToContinueGame(){
        Utils.logState("Player id: "+ myLocalPlayer.getId() +" wants to continue playing.");
    }
    
    //Stage 3 and player wants to leave game
    public void playerWantsToLeaveTheGame(){
        Utils.logState("Player id: "+ myLocalPlayer.getId() +" wants to leave the game.");
    }
    
    
    
}
