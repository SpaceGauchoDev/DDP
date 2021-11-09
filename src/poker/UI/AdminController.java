/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI;
import poker.UI.Framework.Controller;
import poker.UI.Framework.View;

/**
 *
 * @author MDA 174321 :)
 */
public class AdminController extends Controller {
    AdminModel myAdmin;

    public AdminController(View aView, ViewEnum aViewEnum, AdminModel aAdmin) {
        super(aView, aViewEnum);
        myAdmin = aAdmin;
        
        setTitleUnlocalized(myAdmin.getFullName());
    }
    
    
    
}
