/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Player;
import java.util.ArrayList;
import poker.Game.Game;
import poker.Modules;
import poker.UI.Framework.Controller;
import poker.UI.Framework.Observable;
import poker.UI.Framework.ObservableEventsEnum;
import poker.UI.Framework.Observer;
import poker.UI.Framework.View;
import poker.Utils;
/**
 *
 * @author MDA 174321 :)
 */
public class PlayerController extends Controller implements Observer{
    PlayerModel myLocalPlayer;
    ArrayList<PlayerModel> myPlayersInGame = new ArrayList();
    PlayerView myPlayerView;
    Game myGame;
    
    int myCurrentMinBet = 0;    // TODO: get real values
    int myCurrentMaxBet = 20;   // TODO: get real values
   
    public PlayerController(View aView, PlayerModel aPlayer) {
        super(aView);
        myLocalPlayer = aPlayer;
        
        
        if (aView instanceof PlayerView){
            myPlayerView = (PlayerView)aView;
        }
        
        myGame = Modules.getInstance().getGameModule().getGameById(myLocalPlayer.myGameId);
        myGame.addObserver(this);
        
        setWindowTitle(myLocalPlayer.getFullName() + " - " + "En juego: " + myLocalPlayer.myGameId);
        
        myPlayersInGame = myGame.getPlayersModels(myLocalPlayer.getId());
        myPlayerView.setPlayersInfo(myPlayersInGame);
    }
    
    public void onViewClose(){
        myGame.removeObserver(this);
    }
    
    public void updatePlayerInfo(){
        myPlayersInGame = myGame.getPlayersModels(myLocalPlayer.getId());
        myPlayerView.setPlayersInfo(myPlayersInGame);
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

    @Override
    public void update(Observable source, ObservableEventsEnum event) {
        switch(event){
            case O_GAME_STATE_CHANGED:
                // do stuff
                break;
            case O_ROUND_STATE_CHANGED:
                // do stuff
                break;
            case O_PLAYER_JOINED_LOBBY:
                updatePlayerInfo();
                break;
            default:
        }
    }
    
    
    
}
