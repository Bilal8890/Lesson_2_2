package com.company;

public class Banana extends Fruits {
    public Banana(String color, String volume, int weight) {
        super(color, volume, weight);
    }

    @Override
    public void print() {
        System.out.println((getClass().getSimpleName() + " color " + getColor() + " volume " + getVolume() + " weight " + getWeight()));
    }
}
