/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.User;
import poker.Localization.LocalizableString;

/**
 *
 * @author MDA 174321 :)
 */
public enum UserEnum {
    U_ADMIN(1, "Administrador", "Administrator"),
    U_PLAYER(2, "Jugador", "Player");
    
    private int myUser;
    public LocalizableString myLocString;
    private  UserEnum(int aUser, String aName_ES, String aName_EN){
        myUser = aUser;
        myLocString = new LocalizableString(aName_ES, aName_EN);
    }
}
