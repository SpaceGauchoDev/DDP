/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI;
import poker.UI.Framework.Controller;
import poker.UI.Framework.View;
import poker.User.Player;
/**
 *
 * @author MDA 174321 :)
 */
public class PlayerController extends Controller {
    Player myPlayer;

    public PlayerController(View aView, ViewEnum aViewEnum, Player aPlayer) {
        super(aView, aViewEnum);
        myPlayer = aPlayer;
        
        setTitleUnlocalized(myPlayer.getFullName());
    }
}
