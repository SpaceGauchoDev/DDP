/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import java.util.ArrayList;
import poker.Game.StateMachines.GameState_Lobby;
import poker.Game.StateMachines.StateMachine;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class Game extends StateMachine {
    int myId;
    ArrayList<PlayerInGame> myPlayers = new ArrayList();
    
    Pot myPot = new Pot();
    Configuration myConfiguration;
    
    ArrayList<Round> myRounds = new ArrayList();
    int myLastRoundId = 0;
    
    public Game(int aId) {
        myId = aId;
    }

    public Game(Configuration aConfiguration, int aId) {
        myConfiguration = aConfiguration;
        myId = aId;
        
        //Set entry state
        GameState_Lobby state = new GameState_Lobby(this);
        setState(state);
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
    
    public ArrayList<PlayerInGame> getActivePlayers(){
        ArrayList<PlayerInGame> players = new ArrayList();    
        for(PlayerInGame p: myPlayers){
            if(p.getIsActive()){
                players.add(p);
            }
        }
        return players;
    }
    
    public void addToPot(int aFunds){
        myPot.increaseFunds(aFunds);
    }
    
    public void addPlayer_Action(PlayerInGame aPlayerInGame){
        if(aPlayerInGame != null && aPlayerInGame.isValid() && !isFull()){
            myPlayers.add(aPlayerInGame);
        }
        
        // should we transition to next state?
        handleAction();
    }
    
    public void startRound_Action(){
        myLastRoundId++;
        Round round = new Round(this, myLastRoundId);
        myRounds.add(round);
        
        // should we kick any players?
        handleAction();
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
