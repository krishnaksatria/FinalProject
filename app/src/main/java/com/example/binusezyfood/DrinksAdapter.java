package com.example.binusezyfood;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import com.example.binusezyfood.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class DrinksAdapter extends RecyclerView.Adapter<DrinksAdapter.MyViewHolder>{

    Context context;
    List<Menu> drinkList;

    public DrinksAdapter(Context context, List<Menu> orderList) {
        this.context = context;
        this.drinkList = orderList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int ViewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View v = inflater.inflate(R.layout.drink_in_list, parent, false);
        return new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int position) {
        myViewHolder.drinkPrice.setText(Integer.toString(drinkList.get(position).getPrice()));
        myViewHolder.drinkName.setText(drinkList.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return drinkList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView drinkName, drinkPrice;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            drinkName = itemView.findViewById(R.id.drinkName);
            drinkPrice = itemView.findViewById(R.id.drinkPrice);
        }
    }
}
