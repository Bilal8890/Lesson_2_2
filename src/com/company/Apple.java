package com.company;

public class Apple extends Fruits {
    public Apple(String color, String volume, int weight) {
        super(color, volume, weight);
    }

    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + " Color " + getColor() + " volume " + getVolume() + " weight " + getWeight());
    }
}

