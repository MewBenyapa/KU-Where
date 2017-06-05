package com.example.lenovo.kuwhere.data;

/**
 * Created by lenovo on 6/5/2017.
 */

public class Food {
    private int id, rate;
    private double price;
    private String name;

    public Food(int id, int rate, double price, String name) {
        this.id = id;
        this.rate = rate;
        this.price = price;
        this.name = name;
    }

    public String toString() {
        return name + " (" + price + " Baht)";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
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
}
