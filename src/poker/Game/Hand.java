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

    public void setCards(ArrayList<Card> aCards) {
        myCards = aCards;
    }
    
    public Hand() {
        
    }

    @Override
    public int getValue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
