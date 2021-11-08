/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI;

import poker.Localization.LocalizableString;
import poker.UI.Framework.View;
import poker.UI.Framework.Controller;
import poker.User.UserModule;
import poker.Modules;


// TODO: Can we not mix UI with User modules?
import poker.User.Player;
import poker.User.Admin;

/**
 *
 * @author MDA 174321 :)
 */
public class LoginController extends Controller {
    private LocalizableString myAdminTitle = new LocalizableString("Login de administrador", "Admin login");
    private LocalizableString myPlayerTitle = new LocalizableString("Login de jugador", "Player login");
    private UserModule theUserModule = Modules.getInstancia().getUserModule();
            
    public LoginController(View aView, ViewEnum aViewEnum) {
        super(aView, aViewEnum);
        setLoginTitle();
    }
    
    private void setLoginTitle(){
        switch (myViewEnum) {
            case V_ADMIN_LOGIN -> setTitle(myAdminTitle);
            case V_PLAYER_LOGIN -> setTitle(myPlayerTitle);
        }
    }
    
    public void loginAttempt(LoginModel aLoginModel){
        switch (myViewEnum) {
            case V_ADMIN_LOGIN -> adminLoginAttempt(aLoginModel);
            case V_PLAYER_LOGIN -> playerLoginAttempt(aLoginModel);
        }
    }
    
    private void playerLoginAttempt(LoginModel aLoginModel){
        Player player = theUserModule.loginPlayer(aLoginModel.myUsername, aLoginModel.myPassword);
        if(player != null){
            System.out.println("Player login success!");
            myView.dispose();
            myClientUI.navigateToPlayerView(player);
        }else{
            System.out.println("Player login faliure!");
        }
            
    }
    
    private void adminLoginAttempt(LoginModel aLoginModel){
        Admin admin = theUserModule.loginAdmin(aLoginModel.myUsername, aLoginModel.myPassword);
        if(admin != null){
            System.out.println("Admin login success!");
            myView.dispose();
            myClientUI.navigateToAdminView(admin);
        }else{
            System.out.println("Admin login faliure!");
        }
    }

    
}
