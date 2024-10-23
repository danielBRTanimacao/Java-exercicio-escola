package com.daniel;

class Car {
    String name;
    public static void main(String[] args) {
        System.out.println("Privado");
    }

    public String model(String name){
        this.name = name;
        return this.name;
    }
}