package com.example.binusezyfood;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CompleteOrder extends AppCompatActivity {

    String Send1, Send2, Send3, Send4, Total;
    TextView EndCola, EndSprite, EndRootBeer, EndSodaGembira, TotalPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_order);

        Intent InsIntent = getIntent();
        Send1 = InsIntent.getStringExtra("Send1");
        Total = InsIntent.getStringExtra("Total");
        Send2 = InsIntent.getStringExtra("Send2");
        Send3 = InsIntent.getStringExtra("Send3");
        Send4 = InsIntent.getStringExtra("Send4");

        EndCola = findViewById(R.id.EndCola);
        EndSprite = findViewById(R.id.EndSprite);
        EndRootBeer = findViewById(R.id.EndRootBeer);
        EndSodaGembira = findViewById(R.id.EndSodaGembira);
        TotalPrice = findViewById(R.id.TotapPrice);

        EndCola.setText(Send1);
        EndSprite.setText(Send2);
        EndRootBeer.setText(Send3);
        EndSodaGembira.setText(Send4);
        TotalPrice.setText(Total);

    }

    public void ToHome(View view){
        Intent HomeIntent = new Intent(this, MainActivity.class);
        startActivity(HomeIntent);
    }

}