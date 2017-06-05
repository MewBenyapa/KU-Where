package com.example.lenovo.kuwhere.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 6/5/2017.
 */

public class MockUpMenu extends ShowRepository {

    private List<Food> menu;
    private static MockUpMenu instance = null;

    public static MockUpMenu getInstance() {
        if (instance == null) {
            instance = new MockUpMenu();
        }
        return instance;
    }

    @Override
    public void allFood() {
        menu = new ArrayList<Food>();
        menu.add(new Food("Pad Thai", "IUP cafeteria", 35.0));
        menu.add(new Food("Noodle", "IUP cafeteria", 30.0));
        menu.add(new Food("Tom Yum Goong", "IUP cafeteria", 50.0));
        menu.add(new Food("Kow Kok Kapi", "Central cafeteria", 40.0));
        menu.add(new Food("Pad Ka Prao", "Central cafeteria", 35.0));
        menu.add(new Food("Fired Chicken", "Central cafeteria", 40.0));
        menu.add(new Food("Spaghetti", "Economics cafeteria", 50.0));
        menu.add(new Food("Pork Steak", "Economics Cafeteria", 60.0));
        menu.add(new Food("Omlet", "Economics Cafeteria", 25.0));
        menu.add(new Food("Yum Woon Sen", "Management Cafeteria", 35.0));
        menu.add(new Food("Som Tum", "Management Cafeteria", 30.0));
        menu.add(new Food("Bulgogi Rice Bowl", "Management cafeteria", 45.0));
    }

    @Override
    public List<Food> getAllFood() {
        return null;
    }
}
