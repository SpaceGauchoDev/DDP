/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Localization;

import java.util.ArrayList;

/**
 *
 * @author MDA 174321 :)
 */

// NOTE: I am aware that this is a very naive approach at localizable
// sentence construction, I did it just for fun :)
public class LocalizableList implements Localizable{
    ArrayList<LocalizableString> myLocalizableStrings = new ArrayList();
    String myDefaultSeparator = " ";
    boolean myDefaultPeriodAtEnd = false;

    public LocalizableList() {
    }
    
    public void add(LocalizableString aLocalizableString){
        if(aLocalizableString != null){
            myLocalizableStrings.add(aLocalizableString);
        }
    }
    @Override
    public String toLocalizedString(LanguageEnum aLanguage) {
        String localizedString = "";
        for(LocalizableString l:myLocalizableStrings){
            localizedString.concat(l.toLocalizedString(aLanguage));
            localizedString.concat(myDefaultSeparator);
        }
        return localizedString;
    }
    
    public String toLocalizedString(LanguageEnum aLanguage, boolean aPeriodAtEnd) {
        String localizedString = "";
        for(LocalizableString l:myLocalizableStrings){
            localizedString.concat(l.toLocalizedString(aLanguage));
            localizedString.concat(myDefaultSeparator);
            if(aPeriodAtEnd){
                localizedString.concat(".");
            }
        }
        return localizedString;
    }    
    
    public String toLocalizedString(LanguageEnum aLanguage, boolean aPeriodAtEnd, String aSeparator) {
        String localizedString = "";
        for(LocalizableString l:myLocalizableStrings){
            localizedString.concat(l.toLocalizedString(aLanguage));
            if(aSeparator != null){
                localizedString.concat(aSeparator);
            }else{
                localizedString.concat(myDefaultSeparator);
            }
            if(aPeriodAtEnd){
                localizedString.concat(".");
            }
        }
        return localizedString;
    }
    
}
