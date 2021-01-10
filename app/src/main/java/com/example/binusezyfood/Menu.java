package com.example.binusezyfood;

public class Menu {

    private String name;
    private int price;
    private int qty;

    public Menu(String name, int price, int qty) {
        this.name = name;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }
}
