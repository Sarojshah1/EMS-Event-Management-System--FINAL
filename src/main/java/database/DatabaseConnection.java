package database;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class DatabaseConnection {
    public Connection connection;
    Statement statement;
    ResultSet resultset;
    
      public DatabaseConnection(){
        try {
            String username="root";
            String password="saroj@0777";
            Class.forName("com.mysql.cj.jdbc.Driver");
            String databaseUrl="jdbc:mysql://localhost:3306/event_management_system";
            connection = DriverManager.getConnection(databaseUrl,username,password);
            if(connection !=null){
                System.out.println("connected");
                
            }else{
                System.out.println("not connected");
                
            }
            statement=connection.createStatement();
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }
    
      public void manipulate(String query){
        try {
            statement.executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ResultSet retrive(String query){
        try {
            resultset=statement.executeQuery(query);
            return resultset;
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
