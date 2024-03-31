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
    
    public static void withdrawMoney(double value_withdrawn) {
        System.out.println("Sacando");
    }
    
    public static void showStatus() {
        System.out.println("teste");
    }

}

class Manager extends Client {
    
    public Manager(String name, String last_name, int age, String cpf) {
        super(name, last_name, age, cpf);
    }

    public static void createUser() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("================= Criando usuario =================");
        System.out.println("Digite seu nome: ");
        String name = input.nextLine();
        System.out.println("Digite seu sobrenome: ");
        String last_name = input.nextLine();
        System.out.println("Digite sua idade: ");
        int age = input.nextInt();
        System.out.println("Digite seu cpf: ");
        String cpf = input.nextLine();
        
        Client person = new Client(name, last_name, age, cpf);
        actionUser(person);
    }
    
    public static void actionUser(Object person_client) {
        System.out.println(person_client.getClass());
    }
}

public class GerenciaBanco {

    public static void main(String[] args) {
        Manager person_manager = new Manager("Daniel", "Tenório", 19, "000.000.000-00");
        person_manager.createUser();
    }
}
