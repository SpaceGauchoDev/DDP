/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poker.UI;
/**
 *
 * @author MDA 174321 :)
 */
public class TextInputFieldComponent extends javax.swing.JPanel {
    private String myId;
    public String myLabel = "Label";
    public String myText = "Placeholder";
    public String myWarning = "";
    
    public TextInputFieldComponent() {
        initComponents();
    }
    
    public void set(String aLabel, String aText, String aWarning){
        myLabel = aLabel;
        inputLabel_label.setText(aLabel);
        
        myText = aText;
        input_textField.setText(aText);
        
        myWarning = aWarning;
        warning_label.setText(aWarning);
        

    }
    
    public String getInput(){
        return input_textField.getText();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputLabel_label = new javax.swing.JLabel();
        input_textField = new javax.swing.JTextField();
        warning_label = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setMaximumSize(new java.awt.Dimension(320, 62));
        setMinimumSize(new java.awt.Dimension(320, 62));
        setPreferredSize(new java.awt.Dimension(320, 62));

        inputLabel_label.setText("Text field label");

        input_textField.setText("Text field");
        input_textField.setMaximumSize(new java.awt.Dimension(200, 20));
        input_textField.setMinimumSize(new java.awt.Dimension(200, 20));
        input_textField.setPreferredSize(new java.awt.Dimension(200, 20));
        input_textField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_textFieldActionPerformed(evt);
            }
        });

        warning_label.setText("Warning label");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(inputLabel_label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(input_textField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(warning_label)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputLabel_label)
                    .addComponent(input_textField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(warning_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void input_textFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_textFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_input_textFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel inputLabel_label;
    private javax.swing.JTextField input_textField;
    private javax.swing.JLabel warning_label;
    // End of variables declaration//GEN-END:variables
}
