/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import java.util.Objects;
/**
 *
 * @author MDA 174321 :)
 */
public class Card implements Valuable {
    CardOrderEnum myCardOrder = CardOrderEnum.O_2;

    public CardOrderEnum getCardOrder() {
        return myCardOrder;
    }
    CardSuitEnum myCardSuit = CardSuitEnum.S_SPADE;

    public CardSuitEnum getCardSuit() {
        return myCardSuit;
    }
    
    public String getName() {
        return myCardOrder.getName() + " de " + myCardSuit.getName();
    }
    
    public void setCard(CardOrderEnum aCardOrder, CardSuitEnum aCardSuit) {
        myCardOrder = aCardOrder;
        myCardSuit = aCardSuit;
    }
    
    public Card(CardOrderEnum aCardOrder, CardSuitEnum aCardSuit) {
        myCardOrder = aCardOrder;
        myCardSuit = aCardSuit;
    }

    @Override
    public int getValue() {
        return myCardOrder.getValue() + myCardSuit.getValue();
    }
    
    @Override
    public boolean equals(Object aObject){
        if (!(aObject instanceof Card)){
            return false;
        }
        else{
            Card card = (Card)aObject;
            return this.myCardOrder == card.getCardOrder() && this.myCardSuit == card.getCardSuit();
        }        
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.myCardOrder);
        hash = 59 * hash + Objects.hashCode(this.myCardSuit);
        return hash;
    }
}
