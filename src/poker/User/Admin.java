/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.User;

import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class Admin extends User {
    
    @Override
    public boolean isValid(){
        if (Utils.nullOrEmpty(myId))
            return false;

        if (Utils.nullOrEmpty(myPass))
            return false;

        if (Utils.nullOrEmpty(myFullName))
            return false;
        
        return true;
    }
    
    public Admin(String aId, String aPass, String aFullName) {
        myId = aId;
        myPass = aPass;
        myFullName = aFullName;
        myUserEnum = UserEnum.U_ADMIN;
    }
}
