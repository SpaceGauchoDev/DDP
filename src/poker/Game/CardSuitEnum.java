/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import poker.Localization.LocalizableString;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public enum CardSuitEnum implements Valuable{
    S_SPADE(1, "Pica", "Spades"),
    S_CLUB(2, "Trebol", "Clubs"),
    S_DIAMOND(3, "Diamante", "Diamonds"),
    S_HEART(4, "Corazón", "Hearts");
    
    private int mySuit;
    private int myMultiplier = 100;
    public LocalizableString myLocString;

    public LocalizableString getLocString() {
        return myLocString;
    }
    private  CardSuitEnum(int aSuit, String aName_ES, String aName_EN){
        mySuit = aSuit;
        myLocString = new LocalizableString(aName_ES, aName_EN);
    }
   
    @Override
    public int getValue() {
        return mySuit * myMultiplier;
    }
    
    public boolean isRed(){
        return mySuit > 2;
    }
    
    public int getIndex(){
        return mySuit;
    }
}
