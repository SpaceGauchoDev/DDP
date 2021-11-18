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
public enum CardOrderEnum implements Valuable{
    O_2(1, "Dos", "Two"),
    O_3(2, "Tres", "Three"),
    O_4(3, "Cuatro", "Four"),
    O_5(4, "Cinco", "Five"),
    O_6(5, "Seis", "Six"),
    O_7(6, "Siete", "Seven"),
    O_8(7, "Ocho", "Eight"),
    O_9(8, "Nueve", "Nine"),
    O_10(9, "Diez", "Ten"),
    O_J(10, "Jack", "Jack"),
    O_Q(11, "Reina", "Queen"),
    O_K(12, "Rey", "King"),
    O_A(13, "As", "Ace");
    
    private int myCardOrder;
    private int myMultiplier = 1;
    public LocalizableString myLocString;

    public LocalizableString getLocString() {
        return myLocString;
    }

    private  CardOrderEnum(int aCardOrder, String aName_ES, String aName_EN){
        myCardOrder = aCardOrder;
        myLocString = new LocalizableString(aName_ES, aName_EN);
    }
   
    @Override
    public int getValue() {
        return myCardOrder * myMultiplier;
    }
    
    public int getIndex(){
        return myCardOrder;
    }
}
