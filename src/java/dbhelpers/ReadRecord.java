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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.customers;

/**
 *
 * @author agade
 */
public class ReadRecord {
    
    
    private Connection conn;
    private ResultSet results;
    private customers customer = new customers();
    private int CUSTID;
    
    
    
    public ReadRecord(int CUSTID){
    Properties props = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }

        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String pass = props.getProperty("user.password");
        
       
        this.CUSTID = CUSTID;
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, pass);
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void doRead(){
    
        try {
            //set up a string to hold our query
            String query ="SELECT * FROM CUSTOMERS WHERE CUSTID = ?";
            
            //create a preparedstatement using our query string
            
            PreparedStatement ps = conn.prepareStatement(query);
            
            //fill in the prepared statement
            
            ps.setInt(1, CUSTID);
            
            //execute query
            this.results = ps.executeQuery();
            
            this.results.next();
            
            customer.setCustID(this.results.getInt("CUSTID"));
            customer.setFirstName(this.results.getString("FIRSTNAME"));
            customer.setLastName(this.results.getString("LASTNAME"));
            customer.setAddr1(this.results.getString("ADDR1"));
            customer.setAddr2(this.results.getString("ADDR2"));
            customer.setCity(this.results.getString("City"));
            customer.setState(this.results.getString("STATE"));
            customer.setZip(this.results.getString("ZIP"));
            customer.setEmailAddr(this.results.getString("EMAILADDR"));
            customer.setAge(this.results.getInt("AGE"));
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}
    
    public customers getcustomer(){
        return this.customer;
    }
}
