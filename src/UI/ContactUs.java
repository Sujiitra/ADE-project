/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author thamashikumarasinghe
 */
public class ContactUs extends javax.swing.JPanel {

    /**
     * Creates new form ContactUs
     */
    private JPanel viewPanel;

    public ContactUs(JPanel bottomPanel) {
        initComponents();
        this.viewPanel = bottomPanel;
        ImageIcon imgThisImg = new ImageIcon("images/contact-us.png");
        contactusImgLabel.setIcon(imgThisImg);
        ImageIcon emailImg = new ImageIcon("images/email.png");
        emailIcon.setIcon(emailImg);
        ImageIcon contactImg = new ImageIcon("images/phone.png");
        contactIcon.setIcon(contactImg);
        ImageIcon addressImg = new ImageIcon("images/gps.png");
        addressIcon.setIcon(addressImg);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        contactusImgLabel = new javax.swing.JLabel();
        emailIcon = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        addressIcon = new javax.swing.JLabel();
        contactLabel = new javax.swing.JLabel();
        contactIcon = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Contact Us");

        emailLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        emailLabel.setText("getfit@gmail.com");

        contactLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        contactLabel.setText("+14376659978");

        addressLabel.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        addressLabel.setText("No56, Spadina avenue, Black creek");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(318, 318, 318)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(emailIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(emailLabel))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(addressIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(contactIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(contactLabel)
                                            .addComponent(addressLabel))))))
                        .addGap(0, 255, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(contactusImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(emailIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(emailLabel)))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contactLabel)
                    .addComponent(contactIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addressIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(addressLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addComponent(contactusImgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addressIcon;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel contactIcon;
    private javax.swing.JLabel contactLabel;
    private javax.swing.JLabel contactusImgLabel;
    private javax.swing.JLabel emailIcon;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}