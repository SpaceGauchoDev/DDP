/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import java.util.ArrayList;
import java.util.Iterator;
import poker.User.Player;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class GameModule {
    // 6 players per game, 10 funds per blind bet and 5 cards per hand
    Configuration myConfiguration = new Configuration(2,2,10,5);
    ArrayList<Game> myGames = new ArrayList();
    ArrayList<Game> myNonFullGames = new ArrayList();
    int lastGameId = 0;
    
    public GameModule() {
        
    }
    
    public int getCardsPerHand(){
        return myConfiguration.getCardsPerHand();
    }
    
    public int getBlindBetValue(){
        return myConfiguration.getBlindBetValue();
    }
    
    //TODO: Handle by exeption candidate
    private Game createNewGame(){
        if(myConfiguration != null && myConfiguration.isValid()){
            Utils.logState("Creating game.");
            lastGameId++;
            Game newGame = new Game(myConfiguration, lastGameId);
            myGames.add(newGame);
            myNonFullGames.add(newGame);
            return newGame;            
        }else{
            Utils.logState("No valid Configuration object, no games will start, how did we get here?");
            return null;
        }
    }
    
    private void updateNonFullGamesList(){
        
        // Safe iteration remove
        for (Iterator<Game> it = myNonFullGames.iterator(); it.hasNext(); ) {
            Game game = it.next();
            if (game.isFull()) {
                it.remove();
            }
        }
    }

    // There should be NO case where this returns null
    private Game getFirstNonFullGameWithoutPlayer(PlayerInGame aplayerInGame){
        if(myGames.isEmpty() ){
            Utils.logState("No games found.");
            return createNewGame();
        }
        Game game = null;
        for(Game g: myNonFullGames){
            if(!g.hasPlayer(aplayerInGame)){
                Utils.logState("Open game without player id:"+aplayerInGame.getId() +"  found.");
                game = g;
            }
        }
        
        if(game == null){
            Utils.logState("No open games without player found.");
            game = createNewGame();
        }
        return game;
    }
    
    //TODO: Handle by exeption candidate
    public boolean playerJoinAttempt(Player aPlayer){
        if(aPlayer != null && aPlayer.isValid()){
            if(aPlayer.getFunds() >= myConfiguration.getBlindBetValue()){
                // player exists in user structure and they have enough funds to join a game
                PlayerInGame playerInGame = new PlayerInGame(aPlayer.getId(), aPlayer.getFunds());
                Game game = getFirstNonFullGameWithoutPlayer(playerInGame);
                Utils.logState("Player id: "+ aPlayer.getId() + " joining game id: " + game.getId() + ".");
                game.addPlayer_Action(playerInGame);
                updateNonFullGamesList();
                return true;
            }else{
                Utils.logState("Not enough funds for blind bet.");
                return false;
            }
        }
        else{
            Utils.logState("Invalid Player, how did we get here?");                    
            return false;
        }
    }

}
