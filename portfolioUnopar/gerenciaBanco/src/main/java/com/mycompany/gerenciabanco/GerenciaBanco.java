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
        System.out.println("Checando dinheiro que possui");
    }
    
    public static void makeDeposit() {
        System.out.println("Depositando");
    }
    
    public static void withdrawMoney(double value_withdrawn) {
        System.out.println("Sacando");
    }
    
    public static void showStatus() {
        System.out.printf("nome:\n %s", "name");
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
        String name = input.next();
        System.out.println("Digite seu sobrenome: ");
        String last_name = input.next();
        System.out.println("Digite sua idade: ");
        int age = input.nextInt();
        System.out.println("Digite seu cpf: ");
        String cpf = input.next();
        
        Client person = new Client(name, last_name, age, cpf);
        System.out.println("O usuario deseja fazer alguma ação? 1[S] 2[N] ");
        int response = input.nextInt();
        if (response == 1) {
            actionForUser(person, input);
        }
        
    }
    
    public static void actionForUser(Object person, Object input) {
        System.out.println("Ação");
    }
}

public class GerenciaBanco {

    public static void main(String[] args) {
        // instanciando classe depois criar banco de dados
        Manager person_manager = new Manager("Daniel", "Tenório", 19, "000.000.000-00");
        person_manager.createUser();
    }
}
