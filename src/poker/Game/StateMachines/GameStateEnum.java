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
public enum GameStateEnum {
    G_LOBBY(1),
    G_IN_PROGRESS(2),
    G_END(3),
    G_CLOSE(4);
    private int myGameState;
    private  GameStateEnum(int aGameState){
        myGameState = aGameState;
    }
}
