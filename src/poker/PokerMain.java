/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import poker.UI.Login.LoginView;
import poker.UI.ViewEnum;

/**
 *
 * @author MDA 174321 :)
 */
public class PokerMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modules m = Modules.getInstance(); // instanciate sub systems
        SeedData s = new SeedData();
        s.seed();
        //LoginView a = new LoginView(ViewEnum.V_ADMIN_LOGIN);
        LoginView p1 = new LoginView(ViewEnum.V_PLAYER_LOGIN);
        LoginView p2 = new LoginView(ViewEnum.V_PLAYER_LOGIN);
        LoginView p3 = new LoginView(ViewEnum.V_PLAYER_LOGIN);
        
        

    }
    
}
