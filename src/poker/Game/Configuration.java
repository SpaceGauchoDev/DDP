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
public class Configuration {
    int myMinPlayersPerGame;
    int myMaxPlayersPerGame;
    int myBlindBetValue;
    
    public boolean isValid(){
        if (myMinPlayersPerGame <= 0)
            return false;
        if (myMaxPlayersPerGame < myMinPlayersPerGame)
            return false;
        if (myBlindBetValue <= 0)
            return false;
        return true;
    }

    public Configuration(int aMinPlayersPerGame, int aMaxPlayersPerGame, int aBlindBetValue) {
        myMinPlayersPerGame = aMinPlayersPerGame;
        myMaxPlayersPerGame = aMaxPlayersPerGame;
        myBlindBetValue = aBlindBetValue;
    }
}
