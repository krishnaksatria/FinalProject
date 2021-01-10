package com.example.binusezyfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button DrinksBtn, MyOrderBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DrinksBtn = findViewById(R.id.DrinksBtn);
        MyOrderBtn = findViewById(R.id.MyOrderBtn);

        DrinksBtn.setOnClickListener(this);
        MyOrderBtn.setOnClickListener(this);

    }

    public void toDrinks(){
        Intent DrinksIntent = new Intent(this, Drinks.class);
        startActivity(DrinksIntent);
    }

    public void toMyOrder(){
        Intent MyOrderIntent = new Intent(this, MyOrder.class);
        startActivity(MyOrderIntent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.DrinksBtn:
                toDrinks();
                break;

            case R.id.MyOrderBtn:
                toMyOrder();
                break;
        }
    }
}