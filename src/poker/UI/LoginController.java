/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI;

import poker.UI.Framework.View;
import poker.UI.Framework.Controller;

/**
 *
 * @author MDA 174321 :)
 */
public class LoginController extends Controller {

    public LoginController(View aView) {
        super(aView);
        
    }

    
    private void thingHappened(){
        LoginModel m = new LoginModel();
        
        myView.Update(m);
        
    }
   
}
