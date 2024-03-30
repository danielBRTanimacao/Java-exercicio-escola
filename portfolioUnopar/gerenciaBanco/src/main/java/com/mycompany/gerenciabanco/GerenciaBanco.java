/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gerenciabanco;

/**
 *
 * @author danie
 */

import java.util.Scanner;

class Client {
    private String name;
    private String last_name;
    private int age;
    private String cpf;
    
    private double cash_balance;

    public Client(String name, String last_name, int age, String cpf) {
        this.name = name;
        this.last_name = last_name;
        this.age = age;
        this.cpf = cpf;
        this.cash_balance = 0;
    }
    
    public static void checkBalance() {
        System.out.println("Teste");
    }
    
    public static void makeDeposit() {
        System.out.println("Depositando");
    }
    
    public static void withdrawMoney() {
        System.out.println("Sacando");
    }

}

class Manager extends Client {
    
    public Manager(String name, String last_name, int age, String cpf) {
        super(name, last_name, age, cpf);
    }

    public static void createUser() {
        
    }
}

public class GerenciaBanco {

    public static void main(String[] args) {
        System.out.println("testes de novo");
        
        Manager person_manager = new Manager(null, null, 0, null);
    }
}
