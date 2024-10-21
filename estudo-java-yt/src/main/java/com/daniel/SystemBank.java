package com.daniel;

public class SystemBank {
    public static void main(String[] args) {
        Person user = new Person("Bico Seco", 10, "nenhum", 12.3);
        Manager manager = new Manager("Gerente", 23, "Bank", 100, true);
        Bank bras = new Bank(user, manager);

        bras.takeData();
    }
}

class Bank {
    double amount = 10000;
    Person userBank;
    Manager managerBank;

    public Bank(Person userBank, Manager managerBank){
        System.out.println("Qual ação deseja fazer?");
        this.userBank = userBank;
        this.managerBank = managerBank;
    }

    public String takeData(){
        return "";
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
        System.out.println("Olá, " + this.name + " seus dados:\nIdade: " + this.age +"\nTrabalho: " + this.work +"\nDinheiro: " + this.money);
        System.out.println("========================");
    }
}

class Manager extends Person {
    boolean persmissions;

    public Manager(String name, int age, String work, double money, boolean persmissions) {
        super(name, age, work, money);
        this.persmissions = persmissions;
    }
}