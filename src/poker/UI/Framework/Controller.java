/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Framework;

import poker.Display.ClientUI;
import poker.Localization.LocalizableString;
import poker.UI.ViewEnum;

/**
 *
 * @author MDA 174321 :)
 */
public abstract class Controller {
    public View myView;
    public ViewEnum myViewEnum;
    public ClientUI myClientUI = new ClientUI();

    public Controller(View aView, ViewEnum aViewEnum) {
        myView = aView;
        myViewEnum = aViewEnum;
    }
    
    public void setTitle(LocalizableString aLocalizedString){
        myView.mySetTitle(myClientUI.toLocalizedString(aLocalizedString));
    }

    public void setTitleUnlocalized(String aString){
        myView.mySetTitle(aString);
    }
}
