
package View;

import ViewComponent.DefaultForm;
import ViewComponent.HomeForm;
import Menu.MenuEvent;
import ViewComponent.AddVenue;
import ViewComponent.Booking;
import ViewComponent.Calander;
import ViewComponent.EventDetails;
import ViewComponent.Report;
import ViewComponent.venuedetails;
import java.awt.Component;


public class Dashboard extends javax.swing.JFrame {

   
    public Dashboard() {
        initComponents();
        menu1.setEvent(new MenuEvent() {
            
            @Override
            public void selected(int index, int subIndex) {
                
                switch (index) {
                    case 0 -> showForm(new HomeForm());
                    case 1 -> showForm(new Report());
                    case 2-> showForm(new Booking());
                    case 3 -> {
                        if(subIndex==2){
                            showForm(new venuedetails());
                        }else if(subIndex==1){
                            showForm(new AddVenue());
                            
                        }
                    }
                    case 4 -> showForm(new EventDetails());                 
                   case 5 ->showForm(new Calander());
                       case 6->{
                           LoginPage Login=new LoginPage();
                           Login.setVisible(true);
                           Login.pack();
                           Login.setLocationRelativeTo(null);
                           dispose();
//                    Dashboarddispose();
                       }
                       default -> showForm(new DefaultForm("Form : " + index + " " + subIndex));
                }
//                    case 4, 1-> showForm(new EventDetails());
                            }

           
        });
    }

    private void showForm(Component com) {
        body.removeAll();
        body.add(com);
        body.repaint();
        body.revalidate();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        custom = new com.mycompany.custombutton.CustomJPanel();
        scrollPaneWin111 = new Scroll.win11.ScrollPaneWin11();
        menu1 = new Menu.Menu();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Event Management System");

        custom.setBackground(new java.awt.Color(255, 255, 255));

        scrollPaneWin111.setViewportView(menu1);

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout customLayout = new javax.swing.GroupLayout(custom);
        custom.setLayout(customLayout);
        customLayout.setHorizontalGroup(
            customLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customLayout.createSequentialGroup()
                .addComponent(scrollPaneWin111, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 548, Short.MAX_VALUE)
                .addContainerGap())
        );
        customLayout.setVerticalGroup(
            customLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(customLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customLayout.createSequentialGroup()
                        .addComponent(body, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(scrollPaneWin111, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(custom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(custom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel body;
    private com.mycompany.custombutton.CustomJPanel custom;
    private Menu.Menu menu1;
    private Scroll.win11.ScrollPaneWin11 scrollPaneWin111;
    // End of variables declaration//GEN-END:variables
}
