
package Controller;

import Model.AllId;
import View.Dashboard;
import View.UserDashboard;
import database.DatabaseConnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AuthController extends DatabaseConnection  {
    public void SignupMethod(String fullname,String contact,String email,String password,String role){
        
        String query="INSERT INTO credentials(Full_Name,contact_number,Email,password,role) VALUES ('"+fullname+"','"+contact+"','"+email+"','"+password+"','"+role+"')";
        manipulate(query);  
    }
   
        
    public void loginMethod(String email, String password) {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    try {
        // Establish database connection (Replace "your_database_url", "your_username", and "your_password" with actual values)
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_management_system", "root", "saroj@0777");

        // Query for Admin
        String adminQuery = "SELECT * FROM credentials WHERE Email=? AND password=? AND role='Admin'";
        preparedStatement = connection.prepareStatement(adminQuery);
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, password);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int adminId = resultSet.getInt("ID");
            AllId.userId=adminId;
            Dashboard dash = new Dashboard();
            dash.setVisible(true);
            dash.pack();
            dash.setLocationRelativeTo(null);
            System.out.println("Admin ID: " + AllId.userId);
        } else {
            // Query for User
            String userQuery = "SELECT * FROM credentials WHERE Email=? AND password=? AND role='User'";
            preparedStatement = connection.prepareStatement(userQuery);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int userId = resultSet.getInt("ID");
                AllId.userId=userId;
                UserDashboard dash1 = new UserDashboard();
                dash1.setVisible(true);
                dash1.pack();
                dash1.setLocationRelativeTo(null);
                System.out.println("User ID: " + AllId.userId);
                
            } else {
                System.out.println("Invalid credentials");
            }
        }

    } catch (SQLException ex) {
        Logger.getLogger(AuthController.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
        // Close resources in the reverse order of their creation to avoid resource leaks
        try {
            if (resultSet != null) resultSet.close();
            if (preparedStatement != null) preparedStatement.close();
            if (connection != null) connection.close();
        } catch (SQLException ex) {
            Logger.getLogger(AuthController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

    
}
