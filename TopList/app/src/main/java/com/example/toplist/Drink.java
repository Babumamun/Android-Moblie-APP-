package com.example.toplist;

public class Drink {

    private String name;
    private String dsce;
    private int imgId;

    public static Drink[] drinks = {

    new Drink("Latte", "A coupe expresso shots with steamed milk   ", R.drawable.latte),
      new Drink("Cappuccino", "Hot milk and steamed milk foam ", R.drawable.cappuccino),
     new Drink("Filter", "Heights quality beans roasted and brewed fresh ", R.drawable.filter)
    };



    public Drink(String name) {
        this.name = name;
    }

    public Drink(String name, String dsce, int imgId) {
        this.name = name;
        this.dsce = dsce;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDsce() {
        return dsce;
    }

    public void setDsce(String dsce) {
        this.dsce = dsce;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    @Override
    public String toString() {
        return name;
    }
}