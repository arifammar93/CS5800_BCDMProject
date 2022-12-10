package com.example.finalprojectv1;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;

import java.time.LocalDate;
import java.util.List;

//@Entity
//Table(name= "Order")
public class Order {
    //@Column (name = "cart")
    private List<Dish> cart;
    //@Column (name = "total")
    private double total;
    //@Id
    private int userID;
    //@Column (name = "date")
    private LocalDate date;
    //@Column (name = "status")
    private Boolean status;

    public Order(List<Dish> cart, double total, int userID, LocalDate date, Boolean status){
        this.cart = cart;
        this.total = total;
        this.userID = userID;
        this.date = date;
        this.status = status;
    }

    public void setCart(List<Dish> cart) {
        this.cart = cart;
    }

    public List<Dish> getCart() {
        return cart;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotal() {
        return total;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
    public void addToCart(Dish dish){
        cart.add(dish);
        total += dish.getPrice();
    }
    public void deleteFromCart(String Name){
        for(int i = 0; i < cart.size(); i++){
            if(cart.get(i).getName().equals(Name)) {
                total -= cart.get(i).getPrice();
                cart.remove(i);
                break;
            }
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
