package com.example.ubereatsclone;

public class Product {

    //DEFINE FIELDS
    public String name;
    public double price;

    // CREATE CONSTRUCTOR
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // CREATE GETTERS
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
