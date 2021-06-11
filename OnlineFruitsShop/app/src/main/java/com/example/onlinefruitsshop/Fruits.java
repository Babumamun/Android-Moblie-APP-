package com.example.onlinefruitsshop;

public class Fruits {
    String name;
    String price;
    int imgId;
    public static Fruits[] fruits = {
            new Fruits("Apple", "5",  R.drawable.apple),
            new Fruits("Cherry", "10",  R.drawable.cherry),
            new Fruits("Grape", "13", R.drawable.grape),
            new Fruits("Orange", "7", R.drawable.orange)
    };

    public Fruits(String name, String price, int imgId) {
        this.name = name;
        this.price = price;
        this.imgId = imgId;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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
