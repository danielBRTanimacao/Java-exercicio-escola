package com.daniel;

public class SystemBank {
    public static void main(String[] args) {
        Person user = new Person("Bico Seco", 18, "Clt 7x0", 1350);
        Manager manager = new Manager("Gerente", 23, "Bank", 3000, true);
        Bank bras = new Bank(user, manager);

        System.out.println(bras.takeData());
        bras.deposit(100);
        bras.withdrawn(1);
        bras.makeLoan(2000);
    }
}

class Bank {
    double limitBank = 10000;
    double limitUser;
    double amountUser = 0;
    Person userBank;
    Manager managerBank;

    public Bank(Person userBank, Manager managerBank){
        this.userBank = userBank;
        this.limitUser = userBank.salary / 2; 
        this.managerBank = managerBank;
    }

    public String takeData(){
        return "==========================\nOlá, " + this.userBank.name + " seus dados:\nIdade: " + this.userBank.age +"\nTrabalho: " + this.userBank.work +"\nDinheiro: " + this.userBank.salary + "\nLimite: " + this.limitUser + "\n==========================";
    }

    public void deposit(double value) {
        this.amountUser += value;
        System.out.println("Valor depositado com sucesso R$" + this.amountUser);
    }

    public void withdrawn(double value) {
        if (value > this.amountUser) {
            System.out.println("Você não pode retirar esse valor R$" + value + " Seu valor atual R$" + this.amountUser);
        } else {
            this.amountUser -= value;
            System.out.println("Valor retirado com sucesso R$" + value + " Seu valor atual R$" + this.amountUser);
        }
    }

    public void makeLoan(double value){
        System.out.println("emprestimo R$" + value);
    }
}

class Person {
    String name;
    int age;
    String work;
    double salary;

    public Person(String name, int age, String work, double salary){
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
    }
}

class Manager extends Person {
    boolean persmissions;

    public Manager(String name, int age, String work, double salary, boolean persmissions) {
        super(name, age, work, salary);
        this.persmissions = persmissions;
    }
}