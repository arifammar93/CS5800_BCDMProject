package com.example.finalprojectv1;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//Table(name= "User")
public class Customer {
    //@Id
    private int ID;
    //@Column (name = "name")
    private String name;
    //@Column (name = "address")
    private String address;
    //@Column (name = "type")
    private String customerType;


    public Customer(int id, String name, String address, String customerType) {
        ID = id;
        this.name = name;

        this.address = address;
        this.customerType = customerType;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getID() {
        return ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getAddress() {
        return address;
    }
    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }
    public String getCustomerType() {
        return customerType;
    }
}
