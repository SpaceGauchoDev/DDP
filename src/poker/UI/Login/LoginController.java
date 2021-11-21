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
import poker.UI.Player.PlayerModel;
import poker.UI.UserModel;

//External
import poker.User.UserProfileModule;
import poker.Modules;
import poker.Utils;

/**
 *
 * @author MDA 174321 :)
 */
public class LoginController extends Controller {
    private static String myAdminTitle = "Login de administrador";
    private static String myPlayerTitle = "Login de jugador";
    private UserProfileModule theUserModule = Modules.getInstance().getUserModule();
    private boolean myIsPlayer;
            
    public LoginController(View aView, boolean aIsPlayer) {
        super(aView);
        myIsPlayer = aIsPlayer;
        setLoginTitle();
    }
    
    private void setLoginTitle(){
        if(myIsPlayer){
            setWindowTitle(myPlayerTitle);
        
        }else{
            setWindowTitle(myAdminTitle);
        }
    }
    
    public void loginAttempt(String aId, String aPassword){
        if(myIsPlayer){
            playerLoginAttempt(aId, aPassword);
        }else{
            adminLoginAttempt(aId, aPassword);
        }
    }
    
    private void playerLoginAttempt(String aId, String aPassword){
        PlayerModel player = theUserModule.loginPlayer(aId, aPassword);
        if(player != null){
            myView.dispose();
            myClientUI.navigateToPlayerView(player);
        }else{
            Utils.logState("Player login faliure.");
        }
    }
    
    private void adminLoginAttempt(String aId, String aPassword){
        UserModel admin = theUserModule.loginAdmin(aId, aPassword);
        if(admin != null){
            myView.dispose();
            myClientUI.navigateToAdminView(admin);
        }else{
            Utils.logState("Admin login faliure.");
        }
    }
}
