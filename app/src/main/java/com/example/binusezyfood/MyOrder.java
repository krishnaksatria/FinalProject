package com.example.binusezyfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.example.binusezyfood.Menu;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MyOrder extends AppCompatActivity {

    RecyclerView drinkView;
    List<Menu> DrinkList = new ArrayList<Menu>();
    DrinksAdapter drinksAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_order);

        Menu drink1 = new Menu("Coca Cola", 10000, 0);
        Menu drink2 = new Menu("Sprite", 7000, 0);
        Menu drink3 = new Menu("Root Beer", 10000, 0);
        Menu drink4 = new Menu("Soda Gembira", 5000, 0);

        DrinkList.add(drink1);
        DrinkList.add(drink2);
        DrinkList.add(drink3);
        DrinkList.add(drink4);


        drinkView = findViewById(R.id.drinkView);

        drinksAdapter = new DrinksAdapter(this, DrinkList);
        drinkView.setAdapter(drinksAdapter);
        drinkView.setLayoutManager(new LinearLayoutManager(this));

    }
    public void toCompleteOrder(View view){
        Intent CompleteOrderIntent = new Intent(this, CompleteOrder.class);
        startActivity(CompleteOrderIntent);
    }

}