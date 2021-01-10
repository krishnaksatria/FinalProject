package com.example.binusezyfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Order extends AppCompatActivity implements View.OnClickListener {

    Button DrinksBtn, OrderBtn;
    String KeyDrinks;
    Integer Quantity, QtyCola, QtySprite, QtyRootBeer, QtySodaGembira;
    String ViewSG = "Soda Gembira, Rp5.000", ViewC = "Coca Cola, Rp 10.000", ViewS = "Sprite, Rp7.000", ViewRB = "Root Beer, Rp 10.000";
    EditText Qty;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        DrinksBtn = findViewById(R.id.DrinksBtn);
        OrderBtn = findViewById(R.id.OrderBtn);

        DrinksBtn.setOnClickListener(this);
        OrderBtn.setOnClickListener(this);

        TextView ViewDrinks = findViewById(R.id.ViewDrinks);

        Intent InsIntent = getIntent();

        KeyDrinks = InsIntent.getStringExtra("KeyDrinks");
        QtyCola = InsIntent.getIntExtra("QtyCola", 0);
        QtySprite = InsIntent.getIntExtra("QtySprite", 0);
        QtyRootBeer = InsIntent.getIntExtra("QtyRootBeer", 0);
        QtySodaGembira = InsIntent.getIntExtra("QtySodaGembira", 0);

        ViewDrinks.setText(KeyDrinks);
    }

    public void toDrinks(){
        Intent DrinksIntent = new Intent(this, Drinks.class);
        Qty = findViewById(R.id.inputQty);
        Quantity = Integer.valueOf(Qty.getText().toString());
        if (KeyDrinks.equals(ViewSG)){
            DrinksIntent.putExtra("QtyCola", QtyCola);
            DrinksIntent.putExtra("QtySprite", QtySprite);
            DrinksIntent.putExtra("QtyRootBeer", QtyRootBeer);
            DrinksIntent.putExtra("QtySodaGembira", Quantity);
        }
        else if (KeyDrinks.equals(ViewC)){
            DrinksIntent.putExtra("QtyCola", Quantity);
            DrinksIntent.putExtra("QtySprite", QtySprite);
            DrinksIntent.putExtra("QtyRootBeer", QtyRootBeer);
            DrinksIntent.putExtra("QtySodaGembira", QtySodaGembira);
        }
        else if (KeyDrinks.equals(ViewS)){
            DrinksIntent.putExtra("QtyCola", QtyCola);
            DrinksIntent.putExtra("QtySprite", Quantity);
            DrinksIntent.putExtra("QtyRootBeer", QtyRootBeer);
            DrinksIntent.putExtra("QtySodaGembira", QtySodaGembira);
        }
        else if (KeyDrinks.equals(ViewRB)){
            DrinksIntent.putExtra("QtyCola", QtyCola);
            DrinksIntent.putExtra("QtySprite", QtySprite);
            DrinksIntent.putExtra("QtyRootBeer", Quantity);
            DrinksIntent.putExtra("QtySodaGembira", QtySodaGembira);
        }
        startActivity(DrinksIntent);
    }

    public void toMyOrder(){
        Intent MyOrderIntent = new Intent(this, MyOrder.class);
        Qty = findViewById(R.id.inputQty);
        Quantity = Integer.valueOf(Qty.getText().toString());
        if (KeyDrinks.equals(ViewSG)){
            MyOrderIntent.putExtra("QtyCola", QtyCola);
            MyOrderIntent.putExtra("QtySprite", QtySprite);
            MyOrderIntent.putExtra("QtyRootBeer", QtyRootBeer);
            MyOrderIntent.putExtra("QtySodaGembira", Quantity);
        }
        else if (KeyDrinks.equals(ViewC)){
            MyOrderIntent.putExtra("QtyCola", Quantity);
            MyOrderIntent.putExtra("QtySprite", QtySprite);
            MyOrderIntent.putExtra("QtyRootBeer", QtyRootBeer);
            MyOrderIntent.putExtra("QtySodaGembira", QtySodaGembira);
        }
        else if (KeyDrinks.equals(ViewS)){
            MyOrderIntent.putExtra("QtyCola", QtyCola);
            MyOrderIntent.putExtra("QtySprite", Quantity);
            MyOrderIntent.putExtra("QtyRootBeer", QtyRootBeer);
            MyOrderIntent.putExtra("QtySodaGembira", QtySodaGembira);
        }
        else if (KeyDrinks.equals(ViewRB)){
            MyOrderIntent.putExtra("QtyCola", QtyCola);
            MyOrderIntent.putExtra("QtySprite", QtySprite);
            MyOrderIntent.putExtra("QtyRootBeer", Quantity);
            MyOrderIntent.putExtra("QtySodaGembira", QtySodaGembira);
        }
        startActivity(MyOrderIntent);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.DrinksBtn:
                toDrinks();
                break;

            case R.id.OrderBtn:
                toMyOrder();
                break;
        }
    }

}