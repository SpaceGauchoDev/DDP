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
public class Action {
    GameStateEnum myActionType;
    String myStringField;
    int myIntField;

    public Action(GameStateEnum aActionType, String aStringField, int aIntField) {
        myActionType = aActionType;
        myStringField = aStringField;
        myIntField = aIntField;
    }

    public GameStateEnum getActionType() {
        return myActionType;
    }

    public String getStringField() {
        return myStringField;
    }

    public int getIntField() {
        return myIntField;
    }
}
