package com.daniel;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Car carro = new Car("Gol");
    }
}

class Car {
    String name;
    public Car(String name) {
        this.name = name;
        System.out.println("Este carro " + this.name);
    }
}