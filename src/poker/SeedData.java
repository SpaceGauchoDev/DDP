/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import poker.Display.ClientUI;
import poker.Localization.LanguageEnum;
import poker.User.UserModule;

/**
 *
 * @author MDA 174321 :)
 */
public class SeedData {
    public void seed(){
        Modules m = Modules.getInstancia();
        // Users
        UserModule u = m.getUserModule();
        
        // Users Admins
        u.registerAdmin("a", "a", "admin full name");
        
        // Users Players
        u.registerPlayer("p", "p", "player full name", 1);
        u.registerPlayer("manu", "a", "Manuel Atienza", 10);
        u.registerPlayer("diego", "a", "Diego Cazes", 20);
        u.registerPlayer("nico", "a", "Nicolas Puppo", 30);
        u.registerPlayer("pina", "a", "Josefina Fasoli", 40);
        u.registerPlayer("mari", "a", "Mariana ??", 50);
        u.registerPlayer("joaco", "a", "Joaquin Guelfi", 60);
        u.registerPlayer("clau", "a", "Claudio Rey", 70);
        u.registerPlayer("nat", "a", "Natali ???", 80);
    }
    
    
   
    
    
    
    
}
