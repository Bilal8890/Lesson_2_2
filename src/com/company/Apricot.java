package com.company;

public class Apricot extends Fruits {
    public Apricot(String color, String volume, int weight) {
        super(color, volume, weight);
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + " color " + getColor() + " volume " + getVolume() + " weight " + getWeight());
    }
}
