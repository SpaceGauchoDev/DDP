/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import poker.Localization.LanguageEnum;

/**
 *
 * @author MDA 174321 :)
 */
public class Configuration {
    int myMinPlayersPerGame;
    int myMaxPlayersPerGame;
    int myCardsPerHand;
    int myBlindBetValue;
    
    public Configuration(int aMinPlayersPerGame, int aMaxPlayersPerGame, int aBlindBetValue, int aCardsPerHand) {
        myMinPlayersPerGame = aMinPlayersPerGame;
        myMaxPlayersPerGame = aMaxPlayersPerGame;
        myBlindBetValue = aBlindBetValue;
        myCardsPerHand = aCardsPerHand;
    }
    
    // These checks ensure rules integrity
    public boolean isValid(){
        if (myMinPlayersPerGame <= 0)
            return false;
        if (myMaxPlayersPerGame < myMinPlayersPerGame)
            return false;
        if (myCardsPerHand <= 0)
            return false;        
        if (myBlindBetValue <= 0)
            return false;
        
        return true;
    }
    
    public int getMinPlayersPerGame() {
        return myMinPlayersPerGame;
    }

    public int getMaxPlayersPerGame() {
        return myMaxPlayersPerGame;
    }

    public int getCardsPerHand() {
        return myCardsPerHand;
    }

    public int getBlindBetValue() {
        return myBlindBetValue;
    }
    

}
