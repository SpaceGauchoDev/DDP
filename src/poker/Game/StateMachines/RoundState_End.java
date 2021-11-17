/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game.StateMachines;

import poker.Game.Round;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class RoundState_End implements State{

    public RoundState_End(StateMachine aStateMachine) {
        if (aStateMachine instanceof Round){
            Round round = (Round)aStateMachine;
            Utils.logState("Game id: "+ round.getGameId() +" Round id: "+ round.getId() + " transitions to RoundState_End.");
        }        
    }

    @Override
    public void handleAction(StateMachine aStateMachine) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void nextState(StateMachine aStateMachine, State aState) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
