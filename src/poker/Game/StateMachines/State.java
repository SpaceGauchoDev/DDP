/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game.StateMachines;

/**
 *
 * @author MDA 174321 :)
 */
public interface State {
    void next(StateMachine aStateMachine);
    void prev(StateMachine aStateMachine);
}
