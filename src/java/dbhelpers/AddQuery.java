/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbhelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.customers;

/**
 *
 * @author agade
 */
public class AddQuery {
    

   private Connection conn;
    
   public AddQuery(){
        Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }

        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String pass = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, pass);
        } catch (SQLException ex) {
            Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
   }
    
   public void doAdd(customers customer){
       
       try {
           String query = "Insert INTO CUSTOMERS (FIRSTNAME, LASTNAME, ADDR1, ADDR2, CITY, STATE, ZIP, EMAILADDR, AGE) VALUES(?,?,?,?,?,?,?,?,?)";
           
           PreparedStatement ps = conn.prepareStatement(query);
           ps.setString(1, customer.getFirstName());
           ps.setString(2, customer.getLastName());
           ps.setString(3, customer.getAddr1());
           ps.setString(4, customer.getAddr2());
           ps.setString(5, customer.getCity());
           ps.setString(6, customer.getState());
           ps.setString(7, customer.getZip());
           ps.setString(8, customer.getEmailAddr());
           ps.setInt(9, customer.getAge());
           
           ps.executeUpdate();
       } catch (SQLException ex) {
           Logger.getLogger(AddQuery.class.getName()).log(Level.SEVERE, null, ex);
       }
       
       
   }
}
