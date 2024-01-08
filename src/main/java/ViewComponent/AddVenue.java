
package ViewComponent;

import Controller.AdminDashboardController;
import Model.venue;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JFileChooser;



public class AddVenue extends javax.swing.JPanel {
    String filename=null;

    public AddVenue() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new com.mycompany.custombutton.TextField();
        customJPanel3 = new com.mycompany.custombutton.CustomJPanel();
        jLabel2 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        customButton1 = new com.mycompany.custombutton.CustomButton();
        image = new javax.swing.JLabel();
        createEvent = new com.mycompany.custombutton.CustomButton();
        address = new com.mycompany.custombutton.TextField();
        price = new com.mycompany.custombutton.TextField();
        scrollBarCustom1 = new scrollbar.ScrollBarCustom();

        setBackground(new java.awt.Color(255, 255, 255));

        name.setLabelText("Venues Name");
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });

        customJPanel3.setBackground(new java.awt.Color(153, 255, 255));
        customJPanel3.setRoundBottomLeft(30);
        customJPanel3.setRoundBottomRight(30);
        customJPanel3.setRoundTopLeft(30);
        customJPanel3.setRoundTopRight(30);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("ADD VENUES");

        javax.swing.GroupLayout customJPanel3Layout = new javax.swing.GroupLayout(customJPanel3);
        customJPanel3.setLayout(customJPanel3Layout);
        customJPanel3Layout.setHorizontalGroup(
            customJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel3Layout.createSequentialGroup()
                .addGap(285, 285, 285)
                .addComponent(jLabel2)
                .addContainerGap(227, Short.MAX_VALUE))
        );
        customJPanel3Layout.setVerticalGroup(
            customJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 255, 255), new java.awt.Color(204, 255, 255), null, null));

        customButton1.setText("Select Image");
        customButton1.setcolor(new java.awt.Color(153, 255, 255));
        customButton1.setColorBorder(new java.awt.Color(204, 255, 255));
        customButton1.setContentAreaFilled(true);
        customButton1.setOver(true);
        customButton1.setRadius(100);
        customButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customButton1ActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(customButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(image, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap(146, Short.MAX_VALUE)
                .addComponent(customButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(image, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(customButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        createEvent.setForeground(new java.awt.Color(255, 255, 255));
        createEvent.setText("Add Venue");
        createEvent.setcolor(new java.awt.Color(255, 51, 51));
        createEvent.setColorBorder(new java.awt.Color(255, 0, 102));
        createEvent.setColorClick(new java.awt.Color(51, 255, 0));
        createEvent.setColorOver(new java.awt.Color(153, 255, 0));
        createEvent.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        createEvent.setRadius(40);
        createEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEventActionPerformed(evt);
            }
        });

        address.setLabelText("LOCATION");

        price.setLabelText("price");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(price, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(address, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(72, 72, 72)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(scrollBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customJPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(createEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(customJPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(scrollBarCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(createEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void customButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser=new JFileChooser();
        chooser.showOpenDialog(null);
        File f=chooser.getSelectedFile();
        filename=f.getAbsolutePath();
        ImageIcon imageicon =new ImageIcon(filename);
        Image img=imageicon.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        
        image.setIcon(new ImageIcon(img));
    }//GEN-LAST:event_customButton1ActionPerformed

    private void createEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createEventActionPerformed
        // TODO add your handling code here:
//        int price1=Integer.parseInt(price.getText());
////        venue v=new venue(name.getText(),address.getText(),price1,image.getIcon());
//        AdminDashboardController controller=new AdminDashboardController();
//        controller.AddVenues(name.getText(),address.getText(), (Image) image.getIcon(),price1);
    try {
        // Your existing code here
        int price1 = Integer.parseInt(price.getText());

        // Convert ImageIcon to Image and then to byte array
        ImageIcon icon = (ImageIcon) image.getIcon();
        Image img = icon.getImage();
        byte[] imageBytes = convertImageToByteArray(img);

        AdminDashboardController controller = new AdminDashboardController();
        controller.AddVenues(name.getText(), address.getText(), imageBytes, price1);
    } catch (NumberFormatException e) {
        // Handle the case where the input for price is not a valid integer
        System.err.println("Invalid price input: " + e.getMessage());
        // You might want to display an error message to the user
    } catch (Exception e) {
        // Handle other exceptions
        e.printStackTrace();
    }
    name.setText("");
    image.setText("");
    address.setText("");
    price.setText("");

    }//GEN-LAST:event_createEventActionPerformed
    private byte[] convertImageToByteArray(Image image) {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try {
        // Assuming you have a BufferedImage, you can use ImageIO to write it to the ByteArrayOutputStream
        BufferedImage bufferedImage = toBufferedImage(image);
        ImageIO.write(bufferedImage, "png", baos);
    } catch (IOException e) {
        e.printStackTrace();
    }
    return baos.toByteArray();
}
    private BufferedImage toBufferedImage(Image image) {
    if (image instanceof BufferedImage) {
        return (BufferedImage) image;
    }

    // Create a BufferedImage with transparency
    BufferedImage bufferedImage = new BufferedImage(
            image.getWidth(null),
            image.getHeight(null),
            BufferedImage.TYPE_INT_ARGB
    );

    // Draw the image onto the BufferedImage
    Graphics2D bGr = bufferedImage.createGraphics();
    bGr.drawImage(image, 0, 0, null);
    bGr.dispose();

    return bufferedImage;
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.mycompany.custombutton.TextField address;
    private com.mycompany.custombutton.CustomButton createEvent;
    private com.mycompany.custombutton.CustomButton customButton1;
    private com.mycompany.custombutton.CustomJPanel customJPanel3;
    private javax.swing.JLabel image;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLayeredPane jLayeredPane1;
    private com.mycompany.custombutton.TextField name;
    private com.mycompany.custombutton.TextField price;
    private scrollbar.ScrollBarCustom scrollBarCustom1;
    // End of variables declaration//GEN-END:variables

  

    
}
