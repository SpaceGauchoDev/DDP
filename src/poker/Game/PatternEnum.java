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
public enum PatternEnum implements Valuable{
    P_NONE(0, "Ninguno"),
    P_ONE_PAIR(1, "Par"),
    P_THREE_OF_A_KIND(2, "Pierna"),
    P_FLUSH(3, "Color");
    
    private int myPattern;
    private int myMultiplier = 1000;
    private String myName;
    
    public String getName(){
        return myName;
    }

    private  PatternEnum(int aPattern, String aName){
        myPattern = aPattern;
        myName = aName;
    }
   
    @Override
    public int getValue() {
        return myPattern * myMultiplier;
    }
}