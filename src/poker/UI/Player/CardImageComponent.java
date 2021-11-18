/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI.Player;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import poker.Game.CardOrderEnum;
import poker.Game.CardSuitEnum;
import poker.Utils;
/**
 *
 * @author MDA 174321 :)
 */
public class CardImageComponent extends javax.swing.JPanel {
    
    private static String cardReversePath = "src/poker/media/cardReverse.png"; 
    
    private static String cardBgPath = "src/poker/media/card_bg.png"; 
    
    private static String[] cardSuitPaths = {"empty",
                                            "src/poker/media/card_suit_spade.png",
                                            "src/poker/media/card_suit_club.png",
                                            "src/poker/media/card_suit_diamond.png",
                                            "src/poker/media/card_suit_heart.png"};
    
    private static String[] cardOrderBlackPaths = { "empty",
                                                    "src/poker/media/card_order_black_2.png",
                                                    "src/poker/media/card_order_black_3.png",
                                                    "src/poker/media/card_order_black_4.png",
                                                    "src/poker/media/card_order_black_5.png",
                                                    "src/poker/media/card_order_black_6.png",
                                                    "src/poker/media/card_order_black_7.png",
                                                    "src/poker/media/card_order_black_8.png",    
                                                    "src/poker/media/card_order_black_9.png",
                                                    "src/poker/media/card_order_black_10.png",
                                                    "src/poker/media/card_order_black_J.png",
                                                    "src/poker/media/card_order_black_Q.png",
                                                    "src/poker/media/card_order_black_K.png",
                                                    "src/poker/media/card_order_black_A.png"};
    
    private static String[] cardOrderRedPaths = {   "empty",
                                                    "src/poker/media/card_order_red_2.png",
                                                    "src/poker/media/card_order_red_3.png",
                                                    "src/poker/media/card_order_red_4.png",
                                                    "src/poker/media/card_order_red_5.png",
                                                    "src/poker/media/card_order_red_6.png",
                                                    "src/poker/media/card_order_red_7.png",
                                                    "src/poker/media/card_order_red_8.png",    
                                                    "src/poker/media/card_order_red_9.png",
                                                    "src/poker/media/card_order_red_10.png",
                                                    "src/poker/media/card_order_red_J.png",
                                                    "src/poker/media/card_order_red_Q.png",
                                                    "src/poker/media/card_order_red_K.png",
                                                    "src/poker/media/card_order_red_A.png"};     
    
    private BufferedImage myReverseImage;
    private BufferedImage myBgImage;
    private BufferedImage myCardSuitImage;
    private BufferedImage myCardOrderImage;
    
    private boolean myVisible = true;
    
    public CardImageComponent() {
        initComponents();
        setCardReverse();
    }

    public void setCardReverse(){
        // reverse
        try {                
           myReverseImage = ImageIO.read(new File(cardReversePath));
        } catch (IOException ex) {
            Utils.logDebug("File: "+ cardReversePath +" not found.");
        }  
        
        showReverse();
    }
    
    public void setCardFront(CardSuitEnum aCardSuit, CardOrderEnum aCardOrder){
        setCard(aCardSuit, aCardOrder);
        showFront();
    }
    
    public void setCard(CardSuitEnum aCardSuit, CardOrderEnum aCardOrder){
        // bg
        try {                
           myBgImage = ImageIO.read(new File(cardBgPath));
        } catch (IOException ex) {
            Utils.logDebug("File: "+ cardBgPath +" not found.");
        }        
        
        // suit
        String cardSuitPath = cardSuitPaths[aCardSuit.getIndex()];
        try {                
           myCardSuitImage = ImageIO.read(new File(cardSuitPath));
        } catch (IOException ex) {
            Utils.logDebug("File: "+ cardSuitPath +" not found.");
        }        
        
        String cardOrderPath = "";
        if(aCardSuit.isRed()){
            cardOrderPath = cardOrderRedPaths[aCardOrder.getIndex()];
        }else{
            cardOrderPath = cardOrderBlackPaths[aCardOrder.getIndex()];
        }
        
        // order
        try {                
           myCardOrderImage = ImageIO.read(new File(cardOrderPath));
        } catch (IOException ex) {
            Utils.logDebug("File: "+ cardOrderPath +" not found.");
        }
    }
    
    public void showReverse(){
        myVisible = false;
        repaint();
    }
    
    public void showFront(){
        myVisible = true;
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        if(myVisible){
            g.drawImage(myBgImage, 0, 0, this);
            g.drawImage(myCardSuitImage, 0, 0, this);
            g.drawImage(myCardOrderImage, 0, 0, this);
        }else{
            g.drawImage(myReverseImage, 0, 0, this);
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 65, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
