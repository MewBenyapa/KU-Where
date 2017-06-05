package com.example.lenovo.kuwhere.list.show;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.lenovo.kuwhere.R;
import com.example.lenovo.kuwhere.data.Food;

import java.util.ArrayList;

/**
 * Created by lenovo on 6/5/2017.
 */

public class ShowActivity extends AppCompatActivity implements ShowListView {

    ShowListPresenter presenter;
    ArrayAdapter<Food> foodArrayAdapter;
    private ListView foodListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.show);

        foodListView = (ListView) findViewById(R.id.food_list);
        presenter.initialize();
    }

    @Override
    public void updateFood(ArrayList<Food> foods) {
        foodArrayAdapter = createAdapter(foods);
    }

    private ArrayAdapter<Food> createAdapter(ArrayList<Food> foods) {
        return new ArrayAdapter<Food>(this, android.R.layout.simple_list_item_1, foods);
    }
}
