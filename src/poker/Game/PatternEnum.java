/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import poker.Localization.LocalizableString;

/**
 *
 * @author MDA 174321 :)
 */
public enum PatternEnum implements Valuable{
    P_NONE(0, "Ninguno", "None"),
    P_ONE_PAIR(1, "Par", "One pair"),
    P_THREE_OF_A_KIND(2, "Pierna", "Three of a kind"),
    P_FLUSH(3, "Color", "Flush");
    
    private int myPattern;
    private int myMultiplier = 1000;
    public LocalizableString myLocString;

    private  PatternEnum(int aPattern, String aName_ES, String aName_EN){
        myPattern = aPattern;
        myLocString = new LocalizableString(aName_ES, aName_EN);
    }
   
    @Override
    public int getValue() {
        return myPattern * myMultiplier;
    }
}