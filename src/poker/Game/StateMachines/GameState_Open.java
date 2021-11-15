/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game.StateMachines;

import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class GameState_Open implements State {

    @Override
    public void next(StateMachine aStateMachine) {
        aStateMachine.setState(new GameState_Lobby());
    }

    @Override
    public void prev(StateMachine aStateMachine) {
        Utils.logState("Is on root state");
    }
    
}
