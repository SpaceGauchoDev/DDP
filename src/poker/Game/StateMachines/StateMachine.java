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
public abstract class StateMachine {
    private State myState;

    public void handleAction(){
        myState.handleAction(this);
    }
    
    public State getState() {
        return myState;
    }

    public void setState(State aState){
        myState = aState;
    }
}
