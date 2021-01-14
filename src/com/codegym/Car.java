package com.codegym;

public class Car extends Object {

    private String name;

    private String engine;



    public static int numberOfCars = 5;



    public Car(String name, String engine) {

        this.name = name;

        this.engine = engine;

        numberOfCars++;

    }

    public static void main(String[] args) {
    }



    // getters and setters

}