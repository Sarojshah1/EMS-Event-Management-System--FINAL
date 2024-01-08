
package Controller;

import database.DatabaseConnection;
import java.awt.Image;




public class AdminDashboardController {
    DatabaseConnection connection = new DatabaseConnection();
    public void AddVenues(String name,String Address,byte[] image,double price){
        String sql="INSERT INTO venues(NAME,ADDRESS,IMAGE,PRICE) VALUES('"+name+"','"+Address+"','"+image+"','"+price+"')";
        connection.manipulate(sql);
    }
    
    
}
