/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.User;

/**
 *
 * @author MDA 174321 :)
 */
public enum UserEnum {
    U_ADMIN(1, "Administrador"),
    U_PLAYER(2, "Jugador");
    
    private int myUser;
    private String myName;
    
    public String getName(){
        return myName;
    }
    
    private  UserEnum(int aUser, String aName){
        myUser = aUser;
        myName = aName;
    }
}
