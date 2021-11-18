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
public enum CardSuitEnum implements Valuable{
    S_SPADE(1, "Pica"),
    S_CLUB(2, "Trebol"),
    S_DIAMOND(3, "Diamante"),
    S_HEART(4, "Corazón");
    
    private int mySuit;
    private int myMultiplier = 100;
    private String myName;

    public String getName() {
        return myName;
    }
    private  CardSuitEnum(int aSuit, String aName){
        myName = aName;
        mySuit = aSuit;
    }
   
    @Override
    public int getValue() {
        return mySuit * myMultiplier;
    }
    
    public boolean isRed(){
        return mySuit > 2;
    }
    
    public int getIndex(){
        return mySuit;
    }
}
