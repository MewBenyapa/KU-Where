package com.example.lenovo.kuwhere.list.random;

import com.example.lenovo.kuwhere.data.Food;

import java.util.ArrayList;

/**
 * Created by lenovo on 6/5/2017.
 */

public class RandomPresenter {
    private RandomView randomView;

    ArrayList<Food> food;

    public RandomPresenter(RandomView randomView) {
        this.randomView = randomView;
        food = new ArrayList<Food>();
    }

    public void randomMenu() {

    }
}
