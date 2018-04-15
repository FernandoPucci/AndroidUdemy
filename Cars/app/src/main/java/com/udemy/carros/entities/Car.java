package com.udemy.carros.entities;

import android.graphics.drawable.Drawable;

public class Car {

    public int id;
    public String model;
    public int horsePower;
    public double price;

    public String manufacturer;
    public Drawable picture;


    public Car(int id, String model, String manufacturer, int horsePower, double price,  Drawable picture) {
        this.id = id;
        this.model = model;
        this.horsePower = horsePower;
        this.price = price;
        this.manufacturer = manufacturer;
        this.picture = picture;
    }
}
