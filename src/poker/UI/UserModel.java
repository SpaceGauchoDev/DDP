/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI;

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
}
