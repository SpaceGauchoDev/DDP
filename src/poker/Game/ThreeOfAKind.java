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

    public ThreeOfAKind() {
        setPattern(PatternEnum.P_THREE_OF_A_KIND);
    }

    @Override
    public boolean satisfiesPattern(ArrayList<Card> aCards) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
