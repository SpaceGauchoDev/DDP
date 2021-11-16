/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker;

import java.util.ArrayList;
import poker.Game.Card;
import poker.Game.CardOrderEnum;
import poker.Game.CardSuitEnum;
import poker.Game.OnePair;

/**
 *
 * @author MDA 174321 :)
 */
public class UnitTests {

    public UnitTests() {
        doTests();
    }
    
    private void doTests(){
        //1 One pair tie break scenario
        {
            Card ca1 = new Card(CardOrderEnum.O_2, CardSuitEnum.S_DIAMOND);
            Card ca2 = new Card(CardOrderEnum.O_2, CardSuitEnum.S_SPADE);
            Card ca3 = new Card(CardOrderEnum.O_6, CardSuitEnum.S_DIAMOND);
            Card ca4 = new Card(CardOrderEnum.O_3, CardSuitEnum.S_HEART); // <- highest non pattern card, this hand should win
            Card ca5 = new Card(CardOrderEnum.O_A, CardSuitEnum.S_DIAMOND);

            ArrayList<Card> ca = new ArrayList();
            ca.add(ca1);
            ca.add(ca2);
            ca.add(ca3);
            ca.add(ca4);
            ca.add(ca5);

            OnePair oa = new OnePair(ca, 5);
            int scoreA = oa.getValue();

            Card cb1 = new Card(CardOrderEnum.O_2, CardSuitEnum.S_HEART);
            Card cb2 = new Card(CardOrderEnum.O_2, CardSuitEnum.S_CLUB);
            Card cb3 = new Card(CardOrderEnum.O_3, CardSuitEnum.S_CLUB);
            Card cb4 = new Card(CardOrderEnum.O_7, CardSuitEnum.S_CLUB);
            Card cb5 = new Card(CardOrderEnum.O_J, CardSuitEnum.S_DIAMOND);


            ArrayList<Card> cb = new ArrayList();
            cb.add(cb1);
            cb.add(cb2);
            cb.add(cb3);
            cb.add(cb4);
            cb.add(cb5);

            OnePair ob = new OnePair(cb, 5);
            int scoreB = ob.getValue();

            if(scoreA > scoreB){
                Utils.logTest("One pair tie break scenario, correct evaluation");
            }else{
                Utils.logTest("One pair tie break scenario, incorrect evaluation");   
            }        
        }
        
        //2 List all cards values
        {
            ArrayList<Card> allCards = new ArrayList();

            for (int i = 0; i < 4; i++){
                CardSuitEnum cse = CardSuitEnum.S_SPADE;
                if(i == 0)
                 cse = CardSuitEnum.S_SPADE;
                if(i == 1)
                 cse = CardSuitEnum.S_CLUB;
                if(i == 2)
                 cse = CardSuitEnum.S_DIAMOND;
                if(i == 3)
                 cse = CardSuitEnum.S_HEART;

                Card ca1 = new Card(CardOrderEnum.O_2, cse);
                Card ca2 = new Card(CardOrderEnum.O_3, cse);
                Card ca3 = new Card(CardOrderEnum.O_4, cse);
                Card ca4 = new Card(CardOrderEnum.O_5, cse);
                Card ca5 = new Card(CardOrderEnum.O_6, cse);
                Card ca6 = new Card(CardOrderEnum.O_7, cse);
                Card ca7 = new Card(CardOrderEnum.O_8, cse);
                Card ca8 = new Card(CardOrderEnum.O_9, cse);
                Card ca9 = new Card(CardOrderEnum.O_10, cse);
                Card ca10 = new Card(CardOrderEnum.O_J, cse);
                Card ca11 = new Card(CardOrderEnum.O_Q, cse);
                Card ca12 = new Card(CardOrderEnum.O_K, cse);
                Card ca13 = new Card(CardOrderEnum.O_A, cse);

                allCards.add(ca1);
                allCards.add(ca2);
                allCards.add(ca3);
                allCards.add(ca4);
                allCards.add(ca5);
                allCards.add(ca6);
                allCards.add(ca7);
                allCards.add(ca8);
                allCards.add(ca9);
                allCards.add(ca10);
                allCards.add(ca11);
                allCards.add(ca12);
                allCards.add(ca13);
            }

            for (Card c: allCards){
                Utils.logTest(Integer.toString(c.getValue()));
            }
        }
        
        
    }
}
