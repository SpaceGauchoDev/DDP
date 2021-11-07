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
    // 6 players per game and 10 funds per blind bet
    Configuration myConfiguration = new Configuration(1,6,10);
    
    CardOrderEnum a = CardOrderEnum.O_10;
    
    int asas = a.getValue();
    
    public GameModule() {
        
    }
}
