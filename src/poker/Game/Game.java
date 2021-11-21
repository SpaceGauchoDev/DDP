/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import java.util.ArrayList;
import poker.Game.StateMachines.GameState_Lobby;
import poker.Game.StateMachines.StateMachine;
import poker.UI.Framework.Model;
import poker.UI.Framework.ObservableEventsEnum;
import poker.UI.Player.PlayerModel;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class Game extends StateMachine {
    int myId;
    ArrayList<PlayerEntity> myPlayers = new ArrayList();

    public ArrayList<PlayerEntity> getPlayers() {
        return myPlayers;
    }
    
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
    
    public ArrayList<PlayerModel> getPlayersModels(String aLocalPlayerId){
        ArrayList<PlayerModel> playersModel = new ArrayList();
        for (int i = 0; i <myPlayers.size(); i++){
            boolean isLocal = myPlayers.get(i).myId.equals(aLocalPlayerId);
            PlayerModel playerModel = (PlayerModel)myPlayers.get(i).toModel(isLocal);
            playersModel.add(playerModel);
        }
        return playersModel;
    }
    
    public PlayerModel getLocalPlayerModel(String aLocalPlayerId){
        PlayerModel playerModel = null;
        for (int i = 0; i <myPlayers.size(); i++){
            boolean isLocal = myPlayers.get(i).myId.equals(aLocalPlayerId);
            if(isLocal){
                playerModel = (PlayerModel)myPlayers.get(i).toModel(isLocal);
            }
        }
        return playerModel;
    }

    public int getId() {
        return myId;
    }
    
    public boolean isFull(){
        return myPlayers.size() ==  myConfiguration.getMaxPlayersPerGame();
    }
    
    public boolean hasPlayer(PlayerEntity aPlayerInGame){
        return myPlayers.contains(aPlayerInGame);
    }
    
    public ArrayList<PlayerEntity> getActivePlayers(){
        ArrayList<PlayerEntity> players = new ArrayList();    
        for(PlayerEntity p: myPlayers){
            if(p.getIsActive()){
                players.add(p);
            }
        }
        return players;
    }
    
    public void addToPot(int aFunds){
        myPot.increaseFunds(aFunds);
    }
    
    public void addPlayer_Action(PlayerEntity aPlayerInGame){
        if(aPlayerInGame != null && aPlayerInGame.isValid() && !isFull()){
            myPlayers.add(aPlayerInGame);
            aPlayerInGame.setGameId(myId);
            aPlayerInGame.setState("En lobby");
            notifyObservers(ObservableEventsEnum.O_PLAYER_JOINED_LOBBY);
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
