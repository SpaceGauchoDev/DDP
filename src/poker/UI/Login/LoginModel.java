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
    public String myId;
    public String myFullName;

    public LoginModel(String aId, String aFullName) {
        myId = aId;
        myFullName = aFullName;
    }
}
