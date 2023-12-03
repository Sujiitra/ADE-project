/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package MainFrame;

/**
 *
 * @author emmanuelchibua
 */
public class DailyFoodIntake extends javax.swing.JPanel {

    /**
     * Creates new form LoginPage
     */
    public DailyFoodIntake() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        periodLabel = new javax.swing.JLabel();
        periodComboBox = new javax.swing.JComboBox<>();
        dailyFoodIntakeSubmitButton = new javax.swing.JButton();
        pageTitleLabel = new javax.swing.JLabel();
        item1TextField = new javax.swing.JTextField();
        item2TextField = new javax.swing.JTextField();
        item3TextField = new javax.swing.JTextField();
        item4TextField = new javax.swing.JTextField();
        item5TextField = new javax.swing.JTextField();
        item6TextField = new javax.swing.JTextField();
        itemsLabel = new javax.swing.JLabel();
        quantityLabel = new javax.swing.JLabel();
        quantity1TextField = new javax.swing.JTextField();
        quantity2TextField = new javax.swing.JTextField();
        quantity3TextField = new javax.swing.JTextField();
        quantity4TextField = new javax.swing.JTextField();
        quantity5TextField = new javax.swing.JTextField();
        quantity6TextField = new javax.swing.JTextField();
        periodLabel1 = new javax.swing.JLabel();
        quantity4TextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 255));

        periodLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        periodLabel.setForeground(new java.awt.Color(0, 102, 102));
        periodLabel.setText("Period:");

        periodComboBox.setForeground(new java.awt.Color(0, 102, 102));
        periodComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Morning", "Afternoon", "Night" }));
        periodComboBox.setSelectedIndex(-1);
        periodComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                periodComboBoxActionPerformed(evt);
            }
        });

        dailyFoodIntakeSubmitButton.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        dailyFoodIntakeSubmitButton.setForeground(new java.awt.Color(0, 102, 102));
        dailyFoodIntakeSubmitButton.setText("SUBMIT");
        dailyFoodIntakeSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dailyFoodIntakeSubmitButtonActionPerformed(evt);
            }
        });

        pageTitleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        pageTitleLabel.setForeground(new java.awt.Color(0, 102, 102));
        pageTitleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pageTitleLabel.setText("Food Intake Log");

        item1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item1TextFieldActionPerformed(evt);
            }
        });

        item5TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item5TextFieldActionPerformed(evt);
            }
        });

        itemsLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        itemsLabel.setForeground(new java.awt.Color(0, 102, 102));
        itemsLabel.setText("Items");

        quantityLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        quantityLabel.setForeground(new java.awt.Color(0, 102, 102));
        quantityLabel.setText("Quantity");

        periodLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        periodLabel1.setForeground(new java.awt.Color(0, 102, 102));
        periodLabel1.setText("Date:");

        quantity4TextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantity4TextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(116, 116, 116)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pageTitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(periodLabel)
                                .addGap(31, 31, 31)
                                .addComponent(periodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(periodLabel1)))
                        .addGap(18, 18, 18)
                        .addComponent(quantity4TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(itemsLabel)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(item6TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item5TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item4TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item3TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item2TextField, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(item1TextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(quantityLabel)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(quantity1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity5TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(quantity6TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(176, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dailyFoodIntakeSubmitButton)
                .addGap(306, 306, 306))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pageTitleLabel)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(periodLabel)
                    .addComponent(periodComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(periodLabel1)
                    .addComponent(quantity4TextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(itemsLabel)
                    .addComponent(quantityLabel)
                    .addComponent(quantity1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity6TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item5TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity5TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(item6TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(quantity4TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78)
                .addComponent(dailyFoodIntakeSubmitButton)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void dailyFoodIntakeSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dailyFoodIntakeSubmitButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dailyFoodIntakeSubmitButtonActionPerformed

    private void item5TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item5TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item5TextFieldActionPerformed

    private void periodComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_periodComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_periodComboBoxActionPerformed

    private void item1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_item1TextFieldActionPerformed

    private void quantity4TextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantity4TextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantity4TextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dailyFoodIntakeSubmitButton;
    private javax.swing.JTextField item1TextField;
    private javax.swing.JTextField item2TextField;
    private javax.swing.JTextField item3TextField;
    private javax.swing.JTextField item4TextField;
    private javax.swing.JTextField item5TextField;
    private javax.swing.JTextField item6TextField;
    private javax.swing.JLabel itemsLabel;
    private javax.swing.JLabel pageTitleLabel;
    private javax.swing.JComboBox<String> periodComboBox;
    private javax.swing.JLabel periodLabel;
    private javax.swing.JLabel periodLabel1;
    private javax.swing.JTextField quantity1TextField;
    private javax.swing.JTextField quantity2TextField;
    private javax.swing.JTextField quantity3TextField;
    private javax.swing.JTextField quantity4TextField;
    private javax.swing.JTextField quantity4TextField1;
    private javax.swing.JTextField quantity5TextField;
    private javax.swing.JTextField quantity6TextField;
    private javax.swing.JLabel quantityLabel;
    // End of variables declaration//GEN-END:variables
}