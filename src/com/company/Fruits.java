package com.company;

public abstract class Fruits implements Printable {
    private String color;
    private String volume;
    private int weight;

    public Fruits(String color, String volume, int weight) {
        this.color = color;
        this.volume = volume;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public String getVolume() {
        return volume;
    }

    public int getWeight() {
        return weight;
    }
}
