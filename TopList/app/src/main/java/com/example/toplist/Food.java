package com.example.toplist;

public class Food {
    String fname;
    String price;
    int imId;

    public static Food[] foods = {
            new Food("Hamburger1", "10", R.drawable.hb1),
            new Food("Hamburger2", "12", R.drawable.hb2),
            new Food("Hamburger3", "14", R.drawable.hb3),
            new Food("Hamburger4", "20", R.drawable.hb4)
    };


    public Food(String fname, String price, int imId) {
        this.fname = fname;
        this.price = price;
        this.imId = imId;
    }


    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public int getImId() {
        return imId;
    }

    public void setImId(int imId) {
        this.imId = imId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    @Override
    public String toString() {
        return "Food{" +
                "fname='" + fname + '\'' +
                ", price='" + price + '\'' +
                ", imId=" + imId +
                '}';
    }
}