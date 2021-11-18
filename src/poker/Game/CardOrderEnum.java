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
public enum CardOrderEnum implements Valuable{
    O_2(1, "Dos"),
    O_3(2, "Tres"),
    O_4(3, "Cuatro"),
    O_5(4, "Cinco"),
    O_6(5, "Seis"),
    O_7(6, "Siete"),
    O_8(7, "Ocho"),
    O_9(8, "Nueve"),
    O_10(9, "Diez"),
    O_J(10, "Jack"),
    O_Q(11, "Reina"),
    O_K(12, "Rey"),
    O_A(13, "As");
    
    private int myCardOrder;
    private int myMultiplier = 1;
    private String myName;

    public String getName() {
        return myName;
    }

    private  CardOrderEnum(int aCardOrder, String aName){
        myName = aName;
        myCardOrder = aCardOrder;
    }
   
    @Override
    public int getValue() {
        return myCardOrder * myMultiplier;
    }
    
    public int getIndex(){
        return myCardOrder;
    }
}
