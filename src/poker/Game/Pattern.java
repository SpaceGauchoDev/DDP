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

    public PatternEnum getPattern() {
        return myPattern;
    }

    public void setPattern(PatternEnum myPattern) {
        this.myPattern = myPattern;
    }

    @Override
    public int getValue() {
        return myPattern.getValue();
    }    
    
    public abstract boolean satisfiesPattern(ArrayList<Card> aCards);
}
