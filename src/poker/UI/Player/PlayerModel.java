/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Player;

import poker.UI.UserModel;

/**
 *
 * @author MDA 174321 :)
 */
public class PlayerModel extends UserModel{
    int myFunds;
    
    public PlayerModel(String aId, String aFullName, int aFunds) {
        super(aId, aFullName);
        myFunds = aFunds;
    }
}
