/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Login;
import poker.UI.Framework.Model;
/**
 *
 * @author MDA 174321 :)
 */
public class LoginModel extends Model {
    public String myUsername;
    public String myUsernameWarning;
    //TODO: Add username label to model attributes
    public String myPassword;
    public String myPasswordWarning;
    //TODO: Add password label to model attributes

    public LoginModel(String aUsername, String aUsernameWarning, String aPassword, String aPasswordWarning) {
        myUsername = aUsername;
        myUsernameWarning = aUsernameWarning;
        myPassword = aPassword;
        myPasswordWarning = aPasswordWarning;
    }
}
