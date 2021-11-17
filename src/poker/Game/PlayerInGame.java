/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import java.util.Objects;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class PlayerInGame {
    String myId;
    boolean myIsActive = true;
    int myFunds;

    public void setIsActive(boolean aIsActive) {
        myIsActive = aIsActive;
    }

    public PlayerInGame(String aId, int aFunds) {
        myId = aId;
        myFunds = aFunds;
    }
    
    public boolean isValid(){
        if (Utils.nullOrEmpty(myId))
            return false;
        
        return true;        
    }

    public String getId() {
        return myId;
    }

    public boolean getIsActive() {
        return myIsActive;
    }

    public int getFunds() {
        return myFunds;
    }
    
    @Override
    public boolean equals(Object aObject){
        if (!(aObject instanceof PlayerInGame)){
            return false;
        }
        else{
            PlayerInGame playerInGame = (PlayerInGame)aObject;
            return this.myId.equals(playerInGame.myId);
        }        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.myId);
        return hash;
    }
}
