package com.example.lenovo.kuwhere.data;

import java.util.List;
import java.util.Observable;

/**
 * Created by lenovo on 6/5/2017.
 */

public abstract class ShowRepository extends Observable {
    public abstract void allFood();
    public abstract List<Food> getAllFood();
}
