package com.example.finalprojectv1;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//Table(name= "Address")
public class Address {
    //@Column (name = "streetNumber")
    private int streetNumber;
    //@Column (name = "streetName")
    private String streetName;
    //@Column (name = "city")
    private String city;
    //@Column (name = "country")
    private String country;
    //@Column (name = "zipcode")
    private int zipcode;

    public Address(int streetNumber, String streetName, String city, String country, int zipcode) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
    }
    // *** Street Number setter and getter ***
    public int getStreetNumber() {
        return streetNumber;
    }
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
    // *** Street Name setter and getter ***
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    // *** City setter and getter ***
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    // *** Country setter and getter ***
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    // *** Zipcode setter and getter ***
    public int getZipcode() {
        return zipcode;
    }
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
}
