/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;
import java.util.ArrayList;
import poker.Game.StateMachines.RoundState_Blind;
import poker.Game.StateMachines.StateMachine;

/**
 *
 * @author MDA 174321 :)
 */
public class Round extends StateMachine {
    Game myGame;
    int myId;
    ArrayList<PlayerEntity> myRoundPlayers = new ArrayList();
    Deck myDeck = new Deck();
    
    public Round(Game aGame, int aId) {
        myGame = aGame;
        myId = aId;
        
        //Set entry state
        RoundState_Blind state = new RoundState_Blind(this);
        setState(state);        
    }

    public int getId() {
        return myId;
    }
    
    public int getGameId(){
        return myGame.getId();
    }
    
    @Override 
    public boolean equals(Object aObject){
        if (!(aObject instanceof Round)){
            return false;
        }
        else{
            Round round = (Round)aObject;
            return this.myId == round.getId();
        }          
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + this.myId;
        return hash;
    }
}
