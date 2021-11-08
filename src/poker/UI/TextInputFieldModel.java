/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI;

import poker.UI.Framework.Model;

/**
 *
 * @author MDA 174321 :)
 */
public class TextInputFieldModel extends Model{
    public String myLabelText;
    public String myInputFieldText;
    public String myWarningText;

    public TextInputFieldModel(String aLabelText, String aInputFieldText, String aWarningText) {
        myLabelText = aLabelText;
        myInputFieldText = aInputFieldText;
        myWarningText = aWarningText;
    }
}
