/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Player;

import poker.Game.CardOrderEnum;
import poker.Game.CardSuitEnum;
import poker.UI.Framework.Model;

/**
 *
 * @author MDA 174321 :)
 */
public class CardModel extends Model {
    public CardOrderEnum myCardOrderEnum;
    public CardSuitEnum myCardSuitEnum;

    public CardModel(CardOrderEnum aCardOrderEnum, CardSuitEnum aCardSuitEnum) {
        myCardOrderEnum = aCardOrderEnum;
        myCardSuitEnum = aCardSuitEnum;
    }
    
}
