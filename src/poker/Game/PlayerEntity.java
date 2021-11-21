/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import java.util.Objects;
import poker.Entity;
import poker.UI.Framework.Model;
import poker.UI.Framework.Modelable;
import poker.UI.Player.PlayerModel;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class PlayerEntity implements Modelable {
    String myId;
    boolean myIsActive = true;
    int myFunds;
    String myFullName = "";
    int myGameId;
    String myPattern = "";
    String myState = "";

    public String getState() {
        return myState;
    }

    public void setState(String myState) {
        this.myState = myState;
    }

    public void setPattern(String aPattern) {
        myPattern = aPattern;
    }

    public String getPattern() {
        return myPattern;
    }

    public void setGameId(int aGameId) {
        myGameId = aGameId;
    }
    public String getFullName() {
        return myFullName;
    }

    public void setIsActive(boolean aIsActive) {
        myIsActive = aIsActive;
    }

    public PlayerEntity(String aId, int aFunds, String aFullName) {
        myId = aId;
        myFunds = aFunds;
        myFullName = aFullName;
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
        if (!(aObject instanceof PlayerEntity)){
            return false;
        }
        else{
            PlayerEntity playerInGame = (PlayerEntity)aObject;
            return this.myId.equals(playerInGame.myId);
        }        
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.myId);
        return hash;
    }

    @Override
    public Model toModel() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Model toModel(Object aSomeData) {
        boolean isLocal = (boolean)aSomeData; //TODO: use to not send sensitive data of remote players to local player
        PlayerModel playerModel = new PlayerModel(myId, myFullName, myFunds, myGameId, myPattern, isLocal, myState);
        return playerModel;
    }
}
