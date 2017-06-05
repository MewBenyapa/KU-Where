package com.example.lenovo.kuwhere.data;

import android.widget.ImageView;

/**
 * Created by lenovo on 6/5/2017.
 */

public class Food {
    private double price;
    private String name, location;
  //  private ImageView menu;

    public Food(String name, String location, double price) {
        this.location = location;
        this.price = price;
        this.name = name;
       // this.menu = menu;
    }

    public String toString() {
        return name + "\n" + location + "\n" + price + " Baht";
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { this.name = name; }

    public String getLocation() { return location; }

   // public ImageView getMenu() { return menu; }

}
