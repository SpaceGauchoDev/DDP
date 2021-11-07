/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.User;

import java.util.Objects;

/**
 *
 * @author MDA 174321 :)
 */
public abstract class User {
    String myId;
    String myPass;
    String myFullName;
    
    
    public abstract boolean isValid();
    
    @Override
    public boolean equals(Object aObject)
    {
        if (!(aObject instanceof User)){
            return false;
        }
        else{
            User user = (User)aObject;
            return this.myId.equals(user.myId);
        }
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + Objects.hashCode(this.myId);
        return hash;
    }
}
