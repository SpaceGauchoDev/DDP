/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import poker.Game.GameModule;
import poker.UI.Framework.Observable;
import poker.User.UserProfileModule;

/**
 *
 * @author MDA 174321 :)
 */
public class Modules extends Observable {
    // Protected singleton
    private static Modules theInstance;
    
    // Unprotected instances, don't instance more of these please
    private GameModule theGameModule = new GameModule();
    private UserProfileModule theUserModule = new UserProfileModule();
    
    private Modules (){
        
    }
    
    public synchronized static Modules getInstance(){
        if (theInstance == null)
            theInstance = new Modules();
        return theInstance;
    }
    
    public GameModule getGameModule() {
        return theGameModule;
    }

    public UserProfileModule getUserModule() {
        return theUserModule;
    }
}
