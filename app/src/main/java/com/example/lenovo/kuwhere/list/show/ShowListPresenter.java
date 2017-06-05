package com.example.lenovo.kuwhere.list.show;

import com.example.lenovo.kuwhere.data.Food;
import com.example.lenovo.kuwhere.data.ShowRepository;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

/**
 * Created by lenovo on 6/5/2017.
 */

public class ShowListPresenter implements Observer {

    private ShowListView view;
    private ShowRepository repository;

    ArrayList<Food> foods;

    public ShowListPresenter(ShowRepository repository, ShowListView view) {
        this.repository = repository;
        this.view = view;
        foods = new ArrayList<>();
    }

    public void initialize() {
        repository.addObserver(this);
        repository.allFood();
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o == repository) {
            foods = new ArrayList<Food>(repository.getAllFood());
            view.updateFood(foods);
        }
    }
}
