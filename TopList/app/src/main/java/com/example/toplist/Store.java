package com.example.toplist;

public class Store {
    String name;
    String address;
    String phone;
    int imgId;

    public static Store[] stores = {
            new Store("kabilShop", "qingchangchang,Netrokona", "+8801626073284", R.drawable.store1),
            new Store("HabloStore", "Hironpur,chollisa", "+8801767212607", R.drawable.store2),
            new Store("AminulStore", "Bagra,Mymenshing", "+8801721152053", R.drawable.store3)

    };

    public Store(String name, String address, String phone, int imgId) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.imgId = imgId;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", imgId=" + imgId +
                '}';
    }

}
