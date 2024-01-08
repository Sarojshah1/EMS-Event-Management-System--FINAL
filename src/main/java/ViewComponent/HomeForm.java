
package ViewComponent;

import Chart.ModelChart;
import Controller.AdminDashboardController;
import Model.AdminDashboardModel;
import database.DatabaseConnection;
import java.awt.Color;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class HomeForm extends javax.swing.JPanel {

    /**
     * Creates new form HomeForm
     */
    public HomeForm() {
        initComponents();
        chart.setTitle("Events Report");
        chart.addLegend("Event",Color.decode("#7b4397"),Color.decode("#dc2430"));
        setData();
        Data();
    }
  private void setData() {
    DatabaseConnection connection = new DatabaseConnection();
    List<AdminDashboardModel> lists = new ArrayList<>();
    String sql = """
                 SELECT DATE_FORMAT(date, '%M') AS event_date, SUM(ID) AS total_event
                 FROM events
                 GROUP BY DATE_FORMAT(date, '%M')
                 ORDER BY event_date
                 LIMIT 0, 1000""";

    try {
    ResultSet resultSet = connection.retrive(sql);

    if (resultSet != null) {
        while (resultSet.next()) {
            String month = resultSet.getString("event_date");  // Use the correct column name
            int event = resultSet.getInt("total_event");
            lists.add(new AdminDashboardModel(month, event));
        }

        for (AdminDashboardModel d : lists) {
            chart.addData(new ModelChart(d.getMonth(), new double[]{d.getEvent()}));
        }
    } else {
        // Handle the case where the ResultSet is null
        System.err.println("ResultSet is null");
    }
} catch (SQLException ex) {
    Logger.getLogger(AdminDashboardController.class.getName()).log(Level.SEVERE, null, ex);
}

}
  
  private void Data() {
    DatabaseConnection connection = new DatabaseConnection();
    String sql = "SELECT COUNT(ID) AS total_event FROM events ";
    String query = "SELECT COUNT(ID) AS total_venue FROM venues ";
    String query1 = "SELECT COUNT(ID) AS total_booking FROM eventticket ";

    try {
        ResultSet resultSet = connection.retrive(sql);
        

        // Check if the result set is not empty
        if (resultSet.next()) {
            String event = resultSet.getString("total_event");
            Total_Event.setText(event);
            
        } else {
            // Handle the case where the result set is empty
            Total_Event.setText("0"); 
        }

    } catch (SQLException ex) {
        Logger.getLogger(AdminDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {

        ResultSet result = connection.retrive(query);
//        ResultSet result1=connection.retrive(query1);

        // Check if the result set is not empty
        if (result.next()) {

            String venue = result.getString("total_venue");
            Venue.setText(venue);
            
        } else {
            Venue.setText("0");

        }

    } catch (SQLException ex) {
        Logger.getLogger(AdminDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    try {
      
        ResultSet result1=connection.retrive(query1);

        // Check if the result set is not empty
        if (result1.next()) {

            String booking = result1.getString("total_booking");

            Booking.setText(booking);
            
        } else {
            // Handle the case where the result set is empty

            Booking.setText("0");// or any default value
        }

    } catch (SQLException ex) {
        Logger.getLogger(AdminDashboardController.class.getName()).log(Level.SEVERE, null, ex);
    }
    
}



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        customJPanel1 = new com.mycompany.custombutton.CustomJPanel();
        jLabel2 = new javax.swing.JLabel();
        Total_Event = new javax.swing.JLabel();
        customJPanel2 = new com.mycompany.custombutton.CustomJPanel();
        jLabel1 = new javax.swing.JLabel();
        Booking = new javax.swing.JLabel();
        customJPanel3 = new com.mycompany.custombutton.CustomJPanel();
        jLabel3 = new javax.swing.JLabel();
        Venue = new javax.swing.JLabel();
        customJPanel5 = new com.mycompany.custombutton.CustomJPanel();
        jLabel4 = new javax.swing.JLabel();
        panelShadow1 = new panel.PanelShadow();
        chart = new Chart.CurveLineChart();

        setBackground(new java.awt.Color(255, 255, 255));

        customJPanel1.setBackground(new java.awt.Color(153, 255, 255));
        customJPanel1.setRoundBottomLeft(60);
        customJPanel1.setRoundBottomRight(60);
        customJPanel1.setRoundTopLeft(60);
        customJPanel1.setRoundTopRight(60);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("Total Events");

        Total_Event.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Total_Event.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Total_Event.setText("0");

        javax.swing.GroupLayout customJPanel1Layout = new javax.swing.GroupLayout(customJPanel1);
        customJPanel1.setLayout(customJPanel1Layout);
        customJPanel1Layout.setHorizontalGroup(
            customJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(customJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Total_Event, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        customJPanel1Layout.setVerticalGroup(
            customJPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Total_Event, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        customJPanel2.setBackground(new java.awt.Color(153, 255, 255));
        customJPanel2.setRoundBottomLeft(60);
        customJPanel2.setRoundBottomRight(60);
        customJPanel2.setRoundTopLeft(60);
        customJPanel2.setRoundTopRight(60);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Total Bookings");

        Booking.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Booking.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Booking.setText("0");

        javax.swing.GroupLayout customJPanel2Layout = new javax.swing.GroupLayout(customJPanel2);
        customJPanel2.setLayout(customJPanel2Layout);
        customJPanel2Layout.setHorizontalGroup(
            customJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(customJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customJPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Booking, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        customJPanel2Layout.setVerticalGroup(
            customJPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Booking, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        customJPanel3.setBackground(new java.awt.Color(153, 255, 255));
        customJPanel3.setRoundBottomLeft(60);
        customJPanel3.setRoundBottomRight(60);
        customJPanel3.setRoundTopLeft(60);
        customJPanel3.setRoundTopRight(60);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("Total Venues");

        Venue.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Venue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Venue.setText("0");

        javax.swing.GroupLayout customJPanel3Layout = new javax.swing.GroupLayout(customJPanel3);
        customJPanel3.setLayout(customJPanel3Layout);
        customJPanel3Layout.setHorizontalGroup(
            customJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(customJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(customJPanel3Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(Venue, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        customJPanel3Layout.setVerticalGroup(
            customJPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Venue, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        customJPanel5.setBackground(new java.awt.Color(153, 255, 153));
        customJPanel5.setRoundBottomLeft(20);
        customJPanel5.setRoundBottomRight(20);
        customJPanel5.setRoundTopLeft(20);
        customJPanel5.setRoundTopRight(20);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("Dashboard");

        javax.swing.GroupLayout customJPanel5Layout = new javax.swing.GroupLayout(customJPanel5);
        customJPanel5.setLayout(customJPanel5Layout);
        customJPanel5Layout.setHorizontalGroup(
            customJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, customJPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(421, 421, 421))
        );
        customJPanel5Layout.setVerticalGroup(
            customJPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(customJPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelShadow1.setBackground(new java.awt.Color(71, 108, 213));
        panelShadow1.setColorGradient(new java.awt.Color(3, 23, 79));

        javax.swing.GroupLayout panelShadow1Layout = new javax.swing.GroupLayout(panelShadow1);
        panelShadow1.setLayout(panelShadow1Layout);
        panelShadow1Layout.setHorizontalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelShadow1Layout.setVerticalGroup(
            panelShadow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShadow1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(chart, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(customJPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(99, 99, 99)
                .addComponent(customJPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(101, 101, 101)
                .addComponent(customJPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(75, 75, 75))
            .addComponent(customJPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(customJPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(customJPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customJPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customJPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(panelShadow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Booking;
    private javax.swing.JLabel Total_Event;
    private javax.swing.JLabel Venue;
    private Chart.CurveLineChart chart;
    private com.mycompany.custombutton.CustomJPanel customJPanel1;
    private com.mycompany.custombutton.CustomJPanel customJPanel2;
    private com.mycompany.custombutton.CustomJPanel customJPanel3;
    private com.mycompany.custombutton.CustomJPanel customJPanel5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private panel.PanelShadow panelShadow1;
    // End of variables declaration//GEN-END:variables
}
