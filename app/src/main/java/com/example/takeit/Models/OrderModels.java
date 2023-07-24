package com.example.takeit.Models;

public class OrderModels {
    int order_image;
    String order_price,order_number,iteam_name;

    public OrderModels(int order_image, String order_price, String order_number, String iteam_name) {
        this.order_image = order_image;
        this.order_price = order_price;
        this.order_number = order_number;
        this.iteam_name = iteam_name;
    }

    public int getOrder_image() {
        return order_image;
    }

    public void setOrder_image(int order_image) {
        this.order_image = order_image;
    }

    public String getOrder_price() {
        return order_price;
    }

    public void setOrder_price(String order_price) {
        this.order_price = order_price;
    }

    public String getOrder_number() {
        return order_number;
    }

    public void setOrder_number(String order_number) {
        this.order_number = order_number;
    }

    public String getIteam_name() {
        return iteam_name;
    }

    public void setIteam_name(String iteam_name) {
        this.iteam_name = iteam_name;
    }
}
