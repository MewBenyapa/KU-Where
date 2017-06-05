package com.example.lenovo.kuwhere.list.random;

import com.example.lenovo.kuwhere.data.Food;
import com.example.lenovo.kuwhere.data.MockUpMenu;

import java.util.ArrayList;

/**
 * Created by lenovo on 6/5/2017.
 */

public class RandomPresenter {
    private RandomView randomView;
    private MockUpMenu mockUpMenu;

    public RandomPresenter(RandomView randomView) {
        this.randomView = randomView;
        this.mockUpMenu = MockUpMenu.getInstance();
    }

    public void randomMenu() {
        int random = (int) (Math.random() * mockUpMenu.getAllFood().size());
        Food menu = mockUpMenu.getAllFood().get(random);
        randomView.setRandomMenu(menu);
    }
}
