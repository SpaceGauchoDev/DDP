/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Player;

//import java.util.ArrayList;
import poker.UI.UserModel;

/**
 *
 * @author MDA 174321 :)
 */
public class PlayerModel extends UserModel{
    public int myFunds;
    public boolean myIsActive = true;
    public String myState = "";
    public String myPattern = "";
    public boolean myIsLocal = false;

    public int getMyFunds() {
        return myFunds;
    }

    public int getMyGameId() {
        return myGameId;
    }
    public int myGameId;
    
    public PlayerModel(String aId, String aFullName, int aFunds, int aGameId, String aPattern, boolean aIsLocal, String aState) {
        super(aId, aFullName);
        myFunds = aFunds;
        myGameId = aGameId;
        myPattern = aPattern;
        myIsLocal = aIsLocal;
        myState = aState;
    }
}
