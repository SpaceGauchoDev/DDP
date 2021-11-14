/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;
import java.util.ArrayList;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class OnePair extends Pattern {
    ArrayList<Card> myNonPairedCards = new ArrayList();

    public OnePair(ArrayList<Card> aCards, int aCardsPerHand) {
        super(aCards, aCardsPerHand);
        setPattern(PatternEnum.P_ONE_PAIR);
    }
    
    private void fillmyNonPairedCards(ArrayList<Card> aCards){
        for (Card c: aCards){
            Card cardCopy = new Card(c.getCardOrder(), c.getCardSuit());
            myNonPairedCards.add(cardCopy);
        }
    }
    
    private void removeCardIfOrderMatches (CardOrderEnum aReference, ArrayList<Card> aCards){
        myNonPairedCards = new ArrayList();
        for (Card c: aCards){
            if(c.myCardOrder != aReference){
                Card cardCopy = new Card(c.getCardOrder(), c.getCardSuit());
                myNonPairedCards.add(cardCopy);
            }
        }
    }
    
    private Card getHighestValueNonPairedCard (){
        int highestValue = 0;
        Card highestValueCard = null;
        for (Card c: myNonPairedCards){
            if(c.getValue() >  highestValue){
                highestValue = c.getValue();
                highestValueCard = c;
            }
        }
        return highestValueCard;
    }    

    @Override
    public boolean satisfiesPattern(ArrayList<Card> aCards) {
        Utils.logState("satisfiesPattern()");        
        if (aCards == null || aCards.size() < getCardsPerHand())
            return false;

        // do we even have enough cards for a pattern match?
        if(aCards.size() <  2){
            return false;
        }
        
        boolean satisfiesAtLeastOnce = false;
        ArrayList<Integer> values = new ArrayList();
        ArrayList<CardOrderEnum> cardOrdersAlreadyMatched = new ArrayList();
        
        // fill an array with all cards and remove them as pairs are found for them
        // remaining cards will be used for tie breakers
        fillmyNonPairedCards(aCards);
            
        // go through all the cards, checking if at least 1 of the rest
        // coincide with its CardOrderEnum
        // NOTE: 2 nested for's seem like an inefficient implementation :(
        for (int j = 0; j < aCards.size(); j++ ){
            // setting a comparison base reference
            CardOrderEnum reference = aCards.get(j).getCardOrder();
            
            // if we have already found a full match for this reference, dont keep looking
            if(cardOrdersAlreadyMatched.contains(reference))
                continue;            
            
            for(int k = 0; k < aCards.size(); k++ ){
                // first match found, one pair!
                if(k != j && aCards.get(k).getCardOrder() == reference){
                    Utils.logState("one pair found");        
                    cardOrdersAlreadyMatched.add(reference);
                    // we use the reference value for first level ties
                    values.add(getPattern().getValue() + reference.getValue());
                    removeCardIfOrderMatches(reference, aCards);
                    
                    if(!satisfiesAtLeastOnce)
                        satisfiesAtLeastOnce = true;
                    break;
                }
            }
        }
        
        if(satisfiesAtLeastOnce){
            // get the higest version of the pattern match value
            int largestValueSoFar = 0;
            for (int i = 0; i < values.size(); i++){
                if(values.get(i) > largestValueSoFar){
                   largestValueSoFar =  values.get(i);
                }
            }
            // Add highest non pattern card to use in the event of a tie breaker
            Card c = getHighestValueNonPairedCard();
            setValue(largestValueSoFar + c.getValue());
        }
        
        // add non pattern highest card
        
        return satisfiesAtLeastOnce;
    }
}
