package com.example.binusezyfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class Drinks extends AppCompatActivity implements View.OnClickListener{

    Button CocaColaBtn, SpriteBtn, RootBeerBtn, SodaGembiraBtn, MyOrderBtn;
    String ViewSG = "Soda Gembira, Rp5.000", ViewC = "Coca Cola, Rp 10.000", ViewS = "Sprite, Rp7.000", ViewRB = "Root Beer, Rp 10.000";
    Integer QtyCola, QtySprite, QtyRootBeer, QtySodaGembira;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drinks);

        CocaColaBtn = findViewById(R.id.CocaColaBtn);
        SpriteBtn = findViewById(R.id.SpriteBtn);
        RootBeerBtn = findViewById(R.id.RootBeerBtn);
        SodaGembiraBtn = findViewById(R.id.SodaGembiraBtn);
        MyOrderBtn = findViewById(R.id.MyOrderBtn);

        CocaColaBtn.setOnClickListener(this);
        SpriteBtn.setOnClickListener(this);
        RootBeerBtn.setOnClickListener(this);
        SodaGembiraBtn.setOnClickListener(this);
        MyOrderBtn.setOnClickListener(this);

        Intent InsIntent = getIntent();

        QtyCola = InsIntent.getIntExtra("QtyCola", 0);
        QtySprite = InsIntent.getIntExtra("QtySprite", 0);
        QtyRootBeer = InsIntent.getIntExtra("QtyRootBeer", 0);
        QtySodaGembira = InsIntent.getIntExtra("QtySodaGembira", 0);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.CocaColaBtn:
                toCocaCola();
                break;

            case R.id.SpriteBtn:
                toSprite();
                break;

            case R.id.RootBeerBtn:
                toRootBeer();
                break;

            case R.id.SodaGembiraBtn:
                toSodaGembira();
                break;

            case R.id.MyOrderBtn:
                toMyOrder();
                break;
        }
    }

    public void toSodaGembira(){
        Intent SodaGembiraIntent = new Intent(this, Order.class);
        SodaGembiraIntent.putExtra("KeyDrinks", ViewSG);
        SodaGembiraIntent.putExtra("QtyCola", QtyCola);
        SodaGembiraIntent.putExtra("QtySprite", QtySprite);
        SodaGembiraIntent.putExtra("QtyRootBeer", QtyRootBeer);
        SodaGembiraIntent.putExtra("QtySodaGembira", QtySodaGembira);
        startActivity(SodaGembiraIntent);
    }

    public void toCocaCola(){
        Intent CocaColaIntent = new Intent(this, Order.class);
        CocaColaIntent.putExtra("KeyDrinks", ViewC);
        CocaColaIntent.putExtra("QtyCola", QtyCola);
        CocaColaIntent.putExtra("QtySprite", QtySprite);
        CocaColaIntent.putExtra("QtyRootBeer", QtyRootBeer);
        CocaColaIntent.putExtra("QtySodaGembira", QtySodaGembira);
        startActivity(CocaColaIntent);
    }

    public void toSprite(){
        Intent SpriteIntent = new Intent(this, Order.class);
        SpriteIntent.putExtra("KeyDrinks", ViewS);
        SpriteIntent.putExtra("QtyCola", QtyCola);
        SpriteIntent.putExtra("QtySprite", QtySprite);
        SpriteIntent.putExtra("QtyRootBeer", QtyRootBeer);
        SpriteIntent.putExtra("QtySodaGembira", QtySodaGembira);
        startActivity(SpriteIntent);
    }

    public void toRootBeer(){
        Intent RootBeerIntent = new Intent(this, Order.class);
        RootBeerIntent.putExtra("KeyDrinks", ViewRB);
        RootBeerIntent.putExtra("QtyCola", QtyCola);
        RootBeerIntent.putExtra("QtySprite", QtySprite);
        RootBeerIntent.putExtra("QtyRootBeer", QtyRootBeer);
        RootBeerIntent.putExtra("QtySodaGembira", QtySodaGembira);
        startActivity(RootBeerIntent);
    }

    public void toMyOrder(){
        Intent MyOrderIntent = new Intent(this, MyOrder.class);
        MyOrderIntent.putExtra("QtyCola", QtyCola);
        MyOrderIntent.putExtra("QtySprite", QtySprite);
        MyOrderIntent.putExtra("QtyRootBeer", QtyRootBeer);
        MyOrderIntent.putExtra("QtySodaGembira", QtySodaGembira);
        startActivity(MyOrderIntent);
    }
}