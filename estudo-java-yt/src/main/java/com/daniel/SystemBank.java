package com.daniel;

public class SystemBank {
    public static void main(String[] args) {
        Person user = new Person("Bico Seco", 10, "vagaba", 12.3);
    }
}

class Person {
    String name;
    int age;
    String work;
    double money;

    public Person(String name, int age, String work, double money){
        this.name = name;
        this.age = age;
        this.work = work;
        this.money = money;
        System.out.println("========================");
        System.out.println("Olá, " + this.name + " seus dados:\nIdade: " + this.age);
        System.out.println("========================");
    }
}