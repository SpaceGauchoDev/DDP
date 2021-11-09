/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import poker.Localization.LocalizableList;
import poker.Localization.LocalizableString;

/**
 *
 * @author MDA 174321 :)
 */
public class Card implements Valuable {
    CardOrderEnum myCardOrder = CardOrderEnum.O_2;
    CardSuitEnum myCardSuit = CardSuitEnum.S_SPADE;
    LocalizableString myOfConnector = new LocalizableString("de", "of");
    LocalizableList myFullName = new LocalizableList();

    public LocalizableList getMyFullName() {
        return myFullName;
    }
    
    public void setCard(CardOrderEnum aCardOrder, CardSuitEnum aCardSuit) {
        myCardOrder = aCardOrder;
        myCardSuit = aCardSuit;
        
        myFullName.add(myCardOrder.getLocString());
        myFullName.add(myOfConnector);
        myFullName.add(myCardSuit.getLocString());
    }
    
    public Card(CardOrderEnum aCardOrder, CardSuitEnum aCardSuit) {
        myCardOrder = aCardOrder;
        myCardSuit = aCardSuit;
    }

    @Override
    public int getValue() {
        return myCardOrder.getValue() + myCardSuit.getValue();
    }
    
}
