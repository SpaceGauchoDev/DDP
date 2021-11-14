package poker;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MDA 174321 :)
 */
public class Utils {
    private enum VerbosityLevelEnum{
        V_NO_LOGS(0),
        V_STATE_LOGS(1),
        V_TEST_LOGS(2),
        V_DEBUG_LOGS(3);
        
        private int myLevel;

        private  VerbosityLevelEnum(int aLevel){
            myLevel = aLevel;
        }
    }
    
    private static VerbosityLevelEnum myVerbosity = VerbosityLevelEnum.V_STATE_LOGS;
    
    
    public static boolean nullOrEmpty(String s){
            return (s == null || s.length() == 0);
    }
    
    public static void logState(String s){
        if(!nullOrEmpty(s) && myVerbosity.myLevel >= VerbosityLevelEnum.V_STATE_LOGS.myLevel){
            System.out.println(s);
        }
    }
    
    public static void logTest(String s){
        if(!nullOrEmpty(s) && myVerbosity.myLevel >= VerbosityLevelEnum.V_TEST_LOGS.myLevel){
            System.out.println(s);
        }
    }
    
    public static void logDebug(String s){
        if(!nullOrEmpty(s) && myVerbosity.myLevel >= VerbosityLevelEnum.V_DEBUG_LOGS.myLevel){
            System.out.println(s);
        }
    }

}
