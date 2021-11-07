/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.User;

import java.util.ArrayList;

/**
 *
 * @author MDA 174321 :)
 */
public class UserModule {
    private ArrayList<User> myRegisteredUsers = new ArrayList();

    public UserModule() {
        
    }
    
    
    // TODO: repeated behaviour, do we need a generalization to handle lists?
    // add<SomeObject>()
    // <SomeObject>Exists()
    // get<SomeObject>ById()
    
    // Other suspect objects:
    // View.java
    // Component.java 
    public boolean userExists(User aUser){
        return myRegisteredUsers.contains(aUser);
    }
    
    public boolean registerPlayer (String aId, String aPass, String aFullName, int aFunds){
        Player player = new Player(aId, aPass, aFullName, aFunds);
        if(player.isValid() && !userExists(player)){
            return myRegisteredUsers.add(player);
        }        
        return false;
    }
    
    public boolean registerAdmin (String aId, String aPass, String aFullName){
        Admin admin = new Admin(aId, aPass, aFullName);
        if(admin.isValid() && !userExists(admin)){
            return myRegisteredUsers.add(admin);
        }        
        return false;
    }
   
}
