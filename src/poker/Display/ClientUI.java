/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Display;

import poker.Localization.LanguageEnum;
import poker.Localization.LocalizableString;
import poker.UI.AdminView;
import poker.UI.Player.PlayerModel;
import poker.UI.Player.PlayerView;
import poker.UI.UserModel;
import poker.UI.ViewEnum;

/**
 *
 * @author MDA 174321 :)
 */

public class ClientUI {
    // Default display language
    LanguageEnum myDisplayLanguage = LanguageEnum.L_ES;
   
    public ClientUI (){
        
    }

    public LanguageEnum getDisplayLanguage() {
        return myDisplayLanguage;
    }

    public void setDisplayLanguage(LanguageEnum myDisplayLanguage) {
        this.myDisplayLanguage = myDisplayLanguage;
    }
    
    public String toLocalizedString(LocalizableString aLocalizableString){
        return aLocalizableString.toLocalizedString(myDisplayLanguage);
    }
    
    public void navigateToPlayerView(PlayerModel aPlayer){
        PlayerView pv = new PlayerView(ViewEnum.V_GAME, aPlayer);
    }
    
    public void navigateToAdminView(UserModel aAdmin){
        AdminView av = new AdminView(ViewEnum.V_ADMIN, aAdmin);
    }

}
