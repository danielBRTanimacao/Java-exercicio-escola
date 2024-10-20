package com.daniel;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car("Honda", 120);
        System.out.println();
        Car chevrolet = new Car("Chevrolet", 90);   
        System.out.println();
        Car fiat = new Car("Fiat", 220);
        System.out.println();

        honda.makeRace(chevrolet.getHorse());
        fiat.makeRace(chevrolet.getHorse());
        // System.out.println(golzin.getName());
        // System.out.println(golzin.getHorse());
        // System.out.println(chevrolet.getName());
        // System.out.println(chevrolet.getHorse());
    }
}

class Car {
    String name;
    int horse;
    public Car(String name, int horse) {
        this.name = name;
        this.horse = horse;
        System.out.printf("Marca do carro: %s \nPotencia: %scv\n", this.name, this.horse);
    }

    public String getName(){
        return this.name;
    }

    public int getHorse(){
        return this.horse;
    }

    public void makeRace(int carVs){
        if (this.horse > carVs) {
            System.out.println("O " + this.name + " Ganhou!");
        } else if (this.horse == carVs) {
            System.out.println("Deu impate!");
        } else {
            System.out.println("O " + this.name + " Perdeu!");
        }
    }
}