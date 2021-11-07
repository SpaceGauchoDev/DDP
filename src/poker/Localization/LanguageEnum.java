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
public enum LanguageEnum {
    L_ES(1, "Español"),
    L_EN(2, "English");
    
    private int myLanguage;
    private String myName;
    private static String myNoTranslationWarning_ES = "No translation found.";
    private static String myNoTranslationWarning_EN = "Traduccion no encontrada.";
    private  LanguageEnum(int aLanguage, String aName){
        myLanguage = aLanguage;
        myName = aName;
    }
   
    @Override
    public String toString(){
        return myName;
    }
    
    public static String noTranslationFound(LanguageEnum aLanguage){
        return switch (aLanguage) {
            case L_ES -> myNoTranslationWarning_ES;
            case L_EN -> myNoTranslationWarning_EN;
        };
    }
}
