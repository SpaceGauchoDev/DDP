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
    
    public Flush() {
        setPattern(PatternEnum.P_FLUSH);
    }

    @Override
    public boolean satisfiesPattern(ArrayList<Card> aCards) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
