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
public abstract class Pattern implements Valuable  {
    PatternEnum myPattern = PatternEnum.P_NONE;
    boolean mySatisfies;
    ArrayList<Card> myCards;
    int myValue = 0;
    int myCardsPerHand;

    public int getCardsPerHand() {
        return myCardsPerHand;
    }

    public ArrayList<Card> getCards() {
        return myCards;
    }

    public void setSatisfies(boolean mySatisfies) {
        this.mySatisfies = mySatisfies;
    }

    public void setValue(int myValue) {
        this.myValue = myValue;
    }
    
    public Pattern(ArrayList<Card> aCards, int aCardsPerHand){
        myCards = aCards;
        myCardsPerHand = aCardsPerHand;
    }
    
    public PatternEnum getPattern() {
        return myPattern;
    }

    public void setPattern(PatternEnum myPattern) {
        this.myPattern = myPattern;
    }
    
    @Override
    public int getValue() {
        satisfiesPattern(myCards);
        return myValue;
    }
    
    // satisfiesPattern should figure out if myCards satisfies the descendant 
    // rules for pattern, if no pattern is satisfied sets a myValue of 0

    // if the pattern is satisfied more than one time, sets a myValue equal 
    // to the value of the highest valued pattern satisfaction
    public abstract boolean satisfiesPattern(ArrayList<Card> aCards);
}
