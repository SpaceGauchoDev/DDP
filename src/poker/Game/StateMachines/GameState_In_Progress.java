/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game.StateMachines;

import poker.Game.Game;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class GameState_In_Progress implements State{

    public GameState_In_Progress(StateMachine aStateMachine) {
        if (aStateMachine instanceof Game){
            Game game = (Game)aStateMachine;
            Utils.logState("Game id: "+ game.getId() + " transitions to GameState_In_Progress.");
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
