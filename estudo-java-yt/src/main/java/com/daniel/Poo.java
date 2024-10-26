package com.daniel;

public class Poo {
    public static void main(String[] args) {
        Player p = new Player();
        p.take();
        p.kick();
    }
}

abstract class Person {
    protected String name;

    public Person(String name){
        this.name = name;
        System.out.println("Person " + name);
    }

    public abstract void kick();

    public void take(){
        System.out.println("Pegou algo");
    }
}

class Player extends Person {
    public Player() {
        super("Bico seco");
        System.out.println("Player " + name);
    }

    @Override
    public void take() {
        System.out.println(name + " Pegou algo");
    }

    @Override
    public void kick() {
        System.out.println("Bicuda");
    }
}