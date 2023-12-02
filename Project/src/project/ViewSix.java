/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package project;

import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author danielike
 */
public class ViewSix extends javax.swing.JPanel {

    /**
     * Creates new form ViewSix
     */
    private JPanel bottomPanel;
    private boolean errorFlag;
    public ViewSix(JPanel bottomPanel) {
        this.bottomPanel = bottomPanel;
        initComponents();
    }
    
    public String profilePicName="";// this is the global variable for the name of image uploaded by user.
    public File profilePicture;     // this is the global variable for the profile image uploaded by user.
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        selectButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        uploadButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Name", "Age", "Gender", "Height", "Weight", "BMI"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        selectButton.setText("select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Select the Schedule (pdf only):");

        jLabel2.setText("Upload video for this week");

        uploadButton.setText("upload");
        uploadButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uploadButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Add comments:");

        submitButton.setText("Sumbit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(submitButton)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(uploadButton)
                                .addComponent(selectButton)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectButton)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(uploadButton)
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitButton)
                .addContainerGap(85, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser picChooser = new JFileChooser();
        // we need to make sure that this file chooser is allowed to only select picture files
        // so we need a FileNameExtensionFilter
        FileNameExtensionFilter imagesFilter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "jpeg", "pdf");
        picChooser.setFileFilter(imagesFilter);
        picChooser.showOpenDialog(null);

        try{
            File imageFile = picChooser.getSelectedFile();
            String fileAbsolutePath = imageFile.getAbsolutePath();
            //            System.out.println(fileAbsolutePath); //debug
            String fileNameExtension = fileAbsolutePath.split("\\.")[1];
            fileNameExtension = fileNameExtension.toLowerCase(); // in case the files extensions are in upper case.
            //            System.out.println(fileNameExtension); //debug
            // now checking if the file which was selected was an image file
            if ((fileNameExtension.equals("jpg")) ||
                (fileNameExtension.equals("png")) ||
                (fileNameExtension.equals("gif")) ||
                (fileNameExtension.equals("pdf")) ||
                (fileNameExtension.equals("jpeg"))){
                // User has selected an image
                this.profilePicture = imageFile;
                this.profilePicName = imageFile.getName();
            } else{
                // wrong file format
                // show an error popup
                this.profilePicName = ""; // setting it back to blank in case it was initially set before.
                JOptionPane.showMessageDialog(this, "Please select an image file containing one of the following extensions - png, jpg, jpeg, gif", "Image File Not Selected!", HEIGHT);
            }
        } catch(NullPointerException npe){
            // this exception occurs when user presses cancel instead of selecting any image.
            this.profilePicName = ""; // setting it back to blank
        } catch(Exception e){
            System.out.println("Something went wrong here - attachPicButtonActionPerformed()");
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Sorry, but there was an error while selecting the file. Please see the error below:"+"\n"+e, "Oops!", HEIGHT);

        }
    }//GEN-LAST:event_selectButtonActionPerformed

    private void uploadButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uploadButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser picChooser = new JFileChooser();
        // we need to make sure that this file chooser is allowed to only select picture files
        // so we need a FileNameExtensionFilter
        FileNameExtensionFilter imagesFilter = new FileNameExtensionFilter("Image Files", "jpg", "png", "gif", "jpeg", "mp4");
        picChooser.setFileFilter(imagesFilter);
        picChooser.showOpenDialog(null);

        try{
            File imageFile = picChooser.getSelectedFile();
            String fileAbsolutePath = imageFile.getAbsolutePath();
            //            System.out.println(fileAbsolutePath); //debug
            String fileNameExtension = fileAbsolutePath.split("\\.")[1];
            fileNameExtension = fileNameExtension.toLowerCase(); // in case the files extensions are in upper case.
            //            System.out.println(fileNameExtension); //debug
            // now checking if the file which was selected was an image file
            if ((fileNameExtension.equals("jpg")) ||
                (fileNameExtension.equals("png")) ||
                (fileNameExtension.equals("gif")) ||
                (fileNameExtension.equals("mp4")) ||
                (fileNameExtension.equals("jpeg"))){
                // User has selected an image
                this.profilePicture = imageFile;
                this.profilePicName = imageFile.getName();
            } else{
                // wrong file format
                // show an error popup
                this.profilePicName = ""; // setting it back to blank in case it was initially set before.
                JOptionPane.showMessageDialog(this, "Please select an image file containing one of the following extensions - png, jpg, jpeg, gif", "Image File Not Selected!", HEIGHT);
            }
        } catch(NullPointerException npe){
            // this exception occurs when user presses cancel instead of selecting any image.
            this.profilePicName = ""; // setting it back to blank
        } catch(Exception e){
            System.out.println("Something went wrong here - attachPicButtonActionPerformed()");
            System.out.println(e);
            JOptionPane.showMessageDialog(this, "Sorry, but there was an error while selecting the file. Please see the error below:"+"\n"+e, "Oops!", HEIGHT);
        }
    }//GEN-LAST:event_uploadButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        String popupTitle="", popupMessage="";
        
        // Creating an ImageIcon variable to display the icon (if the user selects an image)
        ImageIcon profilePicIcon = new ImageIcon();

        // If the user does not select an icon - it will display either the success icon or fail icon based on the validations
        ImageIcon successIcon = new ImageIcon(System.getProperty("user.dir")+"/src/ui/success_image.png");
        // scaling the success icon
        Image successImage = successIcon.getImage();
        successImage = successImage.getScaledInstance(120, 120, WIDTH);
        successIcon = new ImageIcon(successImage);

        ImageIcon errorIcon = new ImageIcon(System.getProperty("user.dir")+"/src/ui/error_image.png");
        // similarly scaling the failure icon
        Image errorImage = errorIcon.getImage();
        errorImage = errorImage.getScaledInstance(120, 120, WIDTH);
        errorIcon = new ImageIcon(errorImage);
        
        // Test if the selected photo is an image - jpg, jpeg, png, heic
                if(this.profilePicName.isBlank() || this.profilePicName.equals("No Image Uploaded")){
                    // this means that the user has not uploaded any image
                    this.profilePicName = "No Image Uploaded";
                } else {
                    // this means the user has uploaded an image
                    // creating an icon out of the image file:
                    profilePicIcon = new ImageIcon(this.profilePicture.getAbsolutePath());
                    // scaling the profile picture icon
                    Image profilePicImage = profilePicIcon.getImage();
                    profilePicImage = profilePicImage.getScaledInstance(120, 120, WIDTH);
                    profilePicIcon = new ImageIcon(profilePicImage);
                }
                
                if(popupTitle.equals("") && popupMessage.equals("") && (!errorFlag)){
                    popupTitle = "Submitted!";
                    
                    popupMessage = "Your entry has been recorded!"+"\n"
                            +"Image:"+this.profilePicName+"\n";
                    
                    System.out.println("Popup Title: "+popupTitle);
                System.out.println("Popup Body: "+popupMessage);
                }
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imageLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton selectButton;
    private javax.swing.JButton submitButton;
    private javax.swing.JButton uploadButton;
    // End of variables declaration//GEN-END:variables
}