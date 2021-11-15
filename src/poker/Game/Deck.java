/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.Game;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author MDA 174321 :)
 */
public class Deck {
    ArrayList<Card> myCards;
    
    public Deck() {

    }
    
    public ArrayList<Hand> getHands(int aPlayersNumber, int aCardsPerPlayer){
        if(aPlayersNumber <= 0 || aCardsPerPlayer <= 0){
            return null;
        }
        
        initializeDeck(); // NOTE: might be worth not rebuilding the deck every time we get asked hands
        shuffleDeck();

        if(myCards.size() < aPlayersNumber * aCardsPerPlayer){
            return null;
        }
        
        ArrayList<Hand> hands = new ArrayList();
        
        for (int j = 1; j <= aPlayersNumber; j++){
            ArrayList<Card> cardsForHand = new ArrayList();
            
            for (int i = 0; i < aCardsPerPlayer; i++){
                Card card = myCards.get(i*j);
                cardsForHand.add(card);
            }
            
            Hand hand = new Hand(cardsForHand, aCardsPerPlayer);
            hands.add(hand);
        }
        
        return hands;
    }
    
    private void initializeDeck(){
        myCards = new ArrayList();
        
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

            myCards.add(ca1);
            myCards.add(ca2);
            myCards.add(ca3);
            myCards.add(ca4);
            myCards.add(ca5);
            myCards.add(ca6);
            myCards.add(ca7);
            myCards.add(ca8);
            myCards.add(ca9);
            myCards.add(ca10);
            myCards.add(ca11);
            myCards.add(ca12);
            myCards.add(ca13);
        }        
    }
    
    private void shuffleDeck(){
        Collections.shuffle(myCards);
    }
    
}
