/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI;

import java.util.Objects;
import poker.UI.Framework.Model;

/**
 *
 * @author MDA 174321 :)
 */
public class UserModel extends Model {
    String myId;

    public String getId() {
        return myId;
    }
    String myFullName;

    public String getFullName() {
        return myFullName;
    }

    public UserModel(String aId, String aFullName) {
        myId = aId;
        myFullName = aFullName;
    }
    
    @Override
    public boolean equals(Object oObject){
        if (!(oObject instanceof UserModel)){
            return false;
        }
        else{
            UserModel userModel = (UserModel)oObject;
            return this.myId.equals(userModel.myId);
        }
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.myId);
        return hash;
    }
}
