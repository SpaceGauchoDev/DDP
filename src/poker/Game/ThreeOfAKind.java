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
public class ThreeOfAKind extends Pattern {

    public ThreeOfAKind(ArrayList<Card> aCards, int aCardsPerHand) {
        super(aCards, aCardsPerHand);
    }

    
    // Has three cards of the same number CardOrderEnum
    // Compliant with rules even if Configuration.myCardsPerHand changes
    @Override
    public boolean satisfiesPattern(ArrayList<Card> aCards) {
        if (aCards == null || aCards.size() < getCardsPerHand())
            return false;

        // do we even have enough cards for a pattern match?
        if(aCards.size() <  3){
            return false;
        }
        
        boolean satisfies = false;
        ArrayList<Integer> values = new ArrayList();
            
        // go through all the cards, checking if at least 2 of the rest
        // coincide with its CardOrderEnum
        // NOTE: 3 nested for's seems like an inefficient implementation :(
        for (int j = 0; j < aCards.size(); j++ ){
            // setting a comparison base reference
            CardOrderEnum reference = aCards.get(j).getCardOrder();

            for(int k = 0; k < aCards.size(); k++ ){
                // first match found
                if(k != j && aCards.get(k).getCardOrder() == reference){
                    for(int i = 0; i < aCards.size(); i++ ){
                        // second match found, three of a kind!
                        if(i != j && i !=k  && aCards.get(i).getCardOrder() == reference){
                            values.add(getPattern().getValue() + reference.getValue());
                            satisfies = true;
                        }
                    }
                }
            }
        }
        
        if(satisfies){
            // get the higest version of the pattern match value
            int largestValueSoFar = 0;
            for (int i = 0; i < values.size(); i++){
                if(values.get(i) > largestValueSoFar){
                   largestValueSoFar =  values.get(i);
                }
            }
            setValue(largestValueSoFar);
        }
        
        return satisfies;
    }

}
