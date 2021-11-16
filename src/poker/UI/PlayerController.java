/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI;
//import poker.Game.GameModule;
import poker.UI.Framework.Controller;
import poker.UI.Framework.View;
/**
 *
 * @author MDA 174321 :)
 */
public class PlayerController extends Controller {
    PlayerModel myPlayer;
    //GameModule theGameModule;
    boolean myInAGaame = false; 

    public PlayerController(View aView, ViewEnum aViewEnum, PlayerModel aPlayer) {
        super(aView, aViewEnum);
        myPlayer = aPlayer;
        setTitleUnlocalized(myPlayer.getFullName());
    }
    
    
    
    
    
    
}
