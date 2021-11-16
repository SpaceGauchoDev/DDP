/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import java.util.ArrayList;
import poker.Game.StateMachines.GameStateMachine;
import poker.Game.StateMachines.GameState_Lobby;
import poker.Game.StateMachines.GameState_Open;
import poker.Game.StateMachines.GameState_Start;

/**
 *
 * @author MDA 174321 :)
 */
public class Game {
    int myId;
    ArrayList<PlayerInGame> myPlayers = new ArrayList();
    Deck myDeck = new Deck();
    Pot myPot = new Pot();
    Configuration myConfiguration;
    GameStateMachine myGameStateMachine = new GameStateMachine(new GameState_Open());

    public Game(Configuration aConfiguration, int aId) {
        myConfiguration = aConfiguration;
        myId = aId;
        myGameStateMachine.setState(new GameState_Lobby());
    }

    public int getId() {
        return myId;
    }
    
    public boolean isFull(){
        return myPlayers.size() ==  myConfiguration.getMaxPlayersPerGame();
    }
    
    public boolean hasPlayer(PlayerInGame aPlayerInGame){
        return myPlayers.contains(aPlayerInGame);
    }
    
    public void addPlayer(PlayerInGame aPlayerInGame){
        if(aPlayerInGame != null && aPlayerInGame.isValid() && !isFull()){
            myPlayers.add(aPlayerInGame);
        }
        
        if (isFull()){
            myGameStateMachine.setState(new GameState_Start());
        }
    } 
    
    @Override 
    public boolean equals(Object aObject){
        if (!(aObject instanceof Game)){
            return false;
        }
        else{
            Game game = (Game)aObject;
            return this.myId == game.getId();
        }    
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + this.myId;
        return hash;
    }
}
