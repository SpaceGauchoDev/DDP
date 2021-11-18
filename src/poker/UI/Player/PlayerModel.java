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
    public int myGameId;
    
    /*
    public String myPattern; 
    public ArrayList<CardModel> myCards;
    public boolean myWonRound;
    public boolean myHasPattern;
    public String myPatternName;
    public String myHighestCardName;
    public boolean myIsLocalPlayer;
    */
    
    public PlayerModel(String aId, String aFullName, int aFunds, int aGameId) {
        super(aId, aFullName);
        myFunds = aFunds;
        myGameId = aGameId;
    }
}
