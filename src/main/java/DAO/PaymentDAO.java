/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Model.AllId;
import Model.PaymentModel;
import database.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


/**
 *
 * @author Lenovo
 */
public class PaymentDAO extends DatabaseConnection{
    public boolean payment(PaymentModel pay) throws SQLException{
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        String query="SELECT * FROM card_details WHERE card_number=?AND cvc=? AND card_holder_name=? AND expirydate=?";
        preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, pay.getCard_number());
        preparedStatement.setInt(2, pay.getCvc()); // Assuming 'cvc' is an integer in the database
        preparedStatement.setString(3, pay.getCard_holder_name());
       java.util.Date utilDate = pay.getDate();
        java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
        preparedStatement.setDate(4, sqlDate);
        resultSet = preparedStatement.executeQuery();
        if (resultSet.next()) {
            JOptionPane.showConfirmDialog(null, "Payment succesfully recived", "success", JOptionPane.DEFAULT_OPTION);
            return true;
} else {
            System.out.println("Failed to insert record.");
            return false;
}
 }
    public void insertdata(int id){
        Date currentDate = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String formattedDate = dateFormat.format(currentDate);
            String query1="INSERT INTO eventticket(EVENTID,OWNERID,ISPAID,PAIDDATE) VALUES('"+id+"','"+AllId.userId+"',1,'"+formattedDate+"')";
            manipulate(query1);
    }
}
