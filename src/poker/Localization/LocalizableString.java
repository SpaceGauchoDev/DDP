/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Localization;

/**
 *
 * @author MDA 174321 :)
 */
public class LocalizableString implements Localizable {
    
    private String myString_ES;
    private String myString_EN;

    public LocalizableString(String aString_ES, String aString_EN) {
        myString_ES = aString_ES;
        myString_EN = aString_EN;
    }

    @Override
    public String toLocalizedString(LanguageEnum aLanguage) {
        return switch (aLanguage) {
            case L_ES -> myString_ES;
            case L_EN -> myString_EN;
            default -> LanguageEnum.noTranslationFound(aLanguage);
        }; 
    }
}
