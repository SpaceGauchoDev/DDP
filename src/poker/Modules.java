/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import poker.Game.GameModule;
import poker.User.UserModule;

/**
 *
 * @author MDA 174321 :)
 */
public class Modules {
    // Protected singleton
    private static Modules theInstance;
    
    // Unprotected instances, don't instance more of these please
    private GameModule theGameModule = new GameModule();
    private UserModule theUserModule = new UserModule();
    
    private Modules (){
        
    }
    
    public synchronized static Modules getInstancia(){
        if (theInstance == null)
            theInstance = new Modules();
        return theInstance;
    }
    
    public GameModule getGameModule() {
        return theGameModule;
    }

    public UserModule getUserModule() {
        return theUserModule;
    }
}
