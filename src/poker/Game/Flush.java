/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import java.util.ArrayList;

/**
 *
 * @author MDA 174321 :)
 */
public class Flush extends Pattern {
    
    public Flush(ArrayList<Card> aCards, int aCardsPerHand) {
        super(aCards, aCardsPerHand);
    }
    
    // All cards must be of the same CardSuitEnum
    @Override
    public boolean satisfiesPattern(ArrayList<Card> aCards) {
        if (aCards == null || aCards.size() < getCardsPerHand())
            return false;
        
        boolean satisfies = true;
        int numberOfCards = aCards.size();
        CardSuitEnum cardSuit = aCards.get(0).getMyCardSuit();
        
        for(int i = 1; i < numberOfCards; i++){
            if(aCards.get(i).getMyCardSuit() != cardSuit){
                satisfies = false;
                break;
            }
        }
        
        if(satisfies){
            int value = getPattern().getValue() + cardSuit.getValue();
            setValue(value);
        }

        return satisfies;
    }
}
