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
public class Pot {
    int myFunds = 0;

    public Pot() {
    }

    public int getFunds() {
        return myFunds;
    }

    public void increaseFunds(int aFunds) {
        if(aFunds > 0 ){
            myFunds += aFunds;
        }
    }
    
}
