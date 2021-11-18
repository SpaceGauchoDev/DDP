/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Framework;

import poker.UI.AdminView;
import poker.UI.Player.PlayerModel;
import poker.UI.Player.PlayerView;
import poker.UI.UserModel;
/**
 *
 * @author MDA 174321 :)
 */

public class ClientUI {
   
    public ClientUI (){
        
    }

    public void navigateToPlayerView(PlayerModel aPlayer){
        PlayerView pv = new PlayerView(aPlayer);
    }
    
    public void navigateToAdminView(UserModel aAdmin){
        AdminView av = new AdminView(aAdmin);
    }

}
