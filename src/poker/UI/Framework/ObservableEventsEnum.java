/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Framework;

/**
 *
 * @author MDA 174321 :)
 */
public enum ObservableEventsEnum {
    O_GAME_STATE_CHANGED(1),
    O_ROUND_STATE_CHANGED(2),
    O_PLAYER_JOINED_LOBBY(3);
    
    private int myEvent;
    private  ObservableEventsEnum(int aEvent){
        myEvent = aEvent;
    }

}
