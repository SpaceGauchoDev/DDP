/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Player;

/**
 *
 * @author MDA 174321 :)
 */
public class PlayerInfoModel {
    public String myName;
    public String myState;
    public String myFunds;
    public String myPattern;
    public boolean myIsLocal;
    
    public PlayerInfoModel(String aName, String aState, String aFunds, String aPattern, boolean isLocal) {
        myName = aName;
        myState = aState;     
        myFunds = aFunds;
        myPattern = aPattern;
        myIsLocal = isLocal;
    }
    
}
