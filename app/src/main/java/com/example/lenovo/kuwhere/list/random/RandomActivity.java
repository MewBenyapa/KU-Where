package com.example.lenovo.kuwhere.list.random;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import com.example.lenovo.kuwhere.R;
import com.example.lenovo.kuwhere.data.Food;
import com.example.lenovo.kuwhere.data.MockUpMenu;

/**
 * Created by lenovo on 6/5/2017.
 */

public class RandomActivity extends AppCompatActivity implements RandomView {

    private RandomPresenter presenter;
    private EditText name, price, location;
    private Button random;
    private MockUpMenu menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random);

        presenter = new RandomPresenter(this);

        name = (EditText) findViewById(R.id.name);
        price = (EditText) findViewById(R.id.price);
        location = (EditText) findViewById(R.id.location);

        random = (Button) findViewById(R.id.random_menu);
    }

    public void randomMenu(View view) {
        presenter.randomMenu();
    }

    @Override
    public void setRandomMenu(Food food) {
        name.setText("" + food.getName());
        location.setText("" + food.getLocation());
        price.setText("" + food.getPrice() + " Baht");

    }
}
