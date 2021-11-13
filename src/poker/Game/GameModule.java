/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

/**
 *
 * @author MDA 174321 :)
 */
public class GameModule {
    // 6 players per game, 10 funds per blind bet and 5 cards per hand
    Configuration myConfiguration = new Configuration(1,6,10,5);
    
    
    public GameModule() {
        
    }
    
    public int getCardsPerHand(){
        return myConfiguration.getCardsPerHand();
    }

}
