package com.example.finalprojectv1;

import java.time.LocalDate;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

//@Entity
//Table(name= "Dish")
public class Dish {
    //@Column (name = "name")
    private String name;
    //@Id
    private int ID;
    //@Column (name = "price")
    private double price;
    //@Column (name = "date")
    private LocalDate date;


    public Dish(String name, int id, double price, LocalDate date) {
        this.name = name;
        ID = id;
        this.price = price;
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setID(int id) {
        ID = id;
    }

    public int getID() {
        return ID;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }
}
