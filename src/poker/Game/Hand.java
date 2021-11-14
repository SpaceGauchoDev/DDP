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
public class Hand implements Valuable {
    ArrayList<Card> myCards = new ArrayList();
    ArrayList<Pattern> myPatterns = new ArrayList();
    int myCardsPerHand;

    public void setCards(ArrayList<Card> aCards, int aCardsPerHand) {
        myCards = aCards;
        myCardsPerHand = aCardsPerHand;
    }
    
    public void resolvePatterns(){
        
    }
    
    public Hand() {
        
    }
    
    // test all patterns, in rank order and get their values if a match pattern is
    // found
    @Override
    public int getValue() {
        int finalValue = 0;
        int highestPatternValue = 0;
        ArrayList<Pattern> patternsToTest = new ArrayList();
        
        Flush flush = new Flush(myCards, myCardsPerHand);
        ThreeOfAKind threeOfAKind = new ThreeOfAKind(myCards, myCardsPerHand);
        OnePair onePair = new OnePair(myCards, myCardsPerHand);
        
        // these need to be added in the same order as their rank is defined at PatternEnum
        patternsToTest.add(flush);
        patternsToTest.add(threeOfAKind);
        patternsToTest.add(onePair);
        
        for (Pattern p: patternsToTest){
            int patternValue = testPattern(p);
            
            if(patternValue != -1){
                highestPatternValue = patternValue;
                break;
            }
        }
       
        // no pattern found, get highest card
        if(highestPatternValue == 0){
            int highestCardValue = 0;
            for (Card card: myCards){
                if(card.getValue() > highestCardValue){
                    highestCardValue = card.getValue();
                }
            }
            finalValue = highestCardValue;
        }else{
            finalValue = highestPatternValue;
        }
        
        return finalValue;
    }
    
    
    private int testPattern(Pattern aPattern){
        boolean patternFound = aPattern.satisfiesPattern(myCards);
        if(patternFound){
            return aPattern.getValue();
        }
        return -1;
    }
    
    
    
    
}
