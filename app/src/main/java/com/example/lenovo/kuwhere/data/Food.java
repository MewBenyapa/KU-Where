package com.example.lenovo.kuwhere.data;

/**
 * Created by lenovo on 6/5/2017.
 */

public class Food {
    private double price;
    private String name, location;

    public Food(String name, String location, double price) {
        this.location = location;
        this.price = price;
        this.name = name;
    }

    public String toString() {
        return name + " (" + price + " Baht)";
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

}
