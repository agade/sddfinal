/*
 * 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author agade
 */
public class customers {

    private int custID;
    private String firstName;
    private String lastName;
    private String addr1;
    private String addr2;
    private String city;
    private String state;
    private String zip;
    private String emailAddr;
    private int age;

    public customers(int custID, String firstName, String lastName, String addr1, String addr2, String city, String state, String zip, String emailAddr, int age) {
        this.custID = custID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.addr1 = addr1;
        this.addr2 = addr2;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.emailAddr = emailAddr;
        this.age = age;
    }
    public customers(){
        this.custID = 0;
        this.firstName = "";
        this.lastName = "";
        this.addr1 = "";
        this.addr2 = "";
        this.city = "";
        this.state = "";
        this.zip = "";
        this.emailAddr = "";
        this.age = 0;
    }
    public int getCustID() {
        return custID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddr1() {
        return addr1;
    }

    public String getAddr2() {
        return addr2;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    public String getEmailAddr() {
        return emailAddr;
    }

    public int getAge() {
        return age;
    }

    public void setCustID(int custID) {
        this.custID = custID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddr1(String addr1) {
        this.addr1 = addr1;
    }

    public void setAddr2(String addr2) {
        this.addr2 = addr2;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public void setEmailAddr(String emailAddr) {
        this.emailAddr = emailAddr;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    public String toString(){
        return "Customers{" + "custID=" + custID + ", FIRSTNAME=" + firstName + ", LASTNAME=" + lastName + ", ADDR1=" + addr1 + ", ADDR2=" + addr2 + ", CITY=" + city + ", STATE=" + state + ", ZIP=" + zip + ", EMAILADDR=" + emailAddr + ", AGE=" + age +'}';
    }

}
