package com.example.user.fruitsapijava.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FruitPojo {

    @SerializedName("fruit")
    @Expose
    private List<Fruit> fruit = null;

    public List<Fruit> getFruit() {
        return fruit;
    }

    public void setFruit(List<Fruit> fruit) {
        this.fruit = fruit;
    }

}
