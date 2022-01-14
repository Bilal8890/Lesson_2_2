package com.company;

public class Main {

    public static void main(String[] args) {
        createObject("Apple").print();
        createObject("Banana").print();
        createObject("Apricot").print();

    }

    public static Fruits createObject(String className) {
        switch (className) {
            case "Apple":
                return new Apple("red", "big", 5);
            case "Banana":
                return new Banana("yellow", "long", 10);
            case "Apricot":
                return new Apricot("orange", "normal", 3);
            default:
                return null;

        }
    }
}
