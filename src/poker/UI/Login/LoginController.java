/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//This
package poker.UI.Login;

//Package
import poker.UI.Framework.View;
import poker.UI.Framework.Controller;
import poker.UI.PlayerModel;
import poker.UI.UserModel;
import poker.UI.ViewEnum;

//External
import poker.User.UserModule;
import poker.Modules;
import poker.Localization.LocalizableString;
import poker.Utils;



/**
 *
 * @author MDA 174321 :)
 */
public class LoginController extends Controller {
    private LocalizableString myAdminTitle = new LocalizableString("Login de administrador", "Admin login");
    private LocalizableString myPlayerTitle = new LocalizableString("Login de jugador", "Player login");
    private UserModule theUserModule = Modules.getInstance().getUserModule();
            
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
        PlayerModel player = theUserModule.loginPlayer(aLoginModel.myUsername, aLoginModel.myPassword);
        if(player != null){
            myView.dispose();
            myClientUI.navigateToPlayerView(player);
        }else{
            Utils.logState("Player login faliure.");
        }
    }
    
    private void adminLoginAttempt(LoginModel aLoginModel){
        UserModel admin = theUserModule.loginAdmin(aLoginModel.myUsername, aLoginModel.myPassword);
        if(admin != null){
            myView.dispose();
            myClientUI.navigateToAdminView(admin);
        }else{
            Utils.logState("Admin login faliure.");
        }
    }

    
}
