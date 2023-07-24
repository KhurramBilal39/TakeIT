package com.example.takeit.Models;

public class Mainmodel {

    int image;
    String name, update, price, rating, quantity;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUpdate() {
        return update;
    }

    public void setUpdate(String update) {
        this.update = update;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public Mainmodel(int image, String name, String update, String price, String rating, String quantity) {
        this.image = image;
        this.name = name;
        this.update = update;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;

    }
}