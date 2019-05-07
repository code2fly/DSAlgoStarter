package com.generics.shopping;

public class Shirt implements  Colored{

    private String color;

    public Shirt(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return this.color;
    }
}
