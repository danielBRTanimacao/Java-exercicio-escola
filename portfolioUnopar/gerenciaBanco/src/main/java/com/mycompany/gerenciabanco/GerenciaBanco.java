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
        // se for menor idade não e possivel criar conta
        if (age >= 18) {
            System.out.println("Digite seu cpf: ");
            String cpf = input.next();

            Client person = new Client(name, last_name, age, cpf);
            System.out.println("O usuario deseja fazer alguma ação?\nDigite 1[Sim] ou 2[Não]: ");
            int response = input.nextInt();
            if (response == 1) {
                boolean continue_ = true;
                while(continue_) {
                    System.out.println(
                            "Bem vindo qual ação deseja fazer?"
                                    + "\n1 - Consultar SALDO/STATUS"
                                    + "\n2 - Fazer DEPOSITO"
                                    + "\n3 - Fazer um SAQUE"
                                    + "\n4 - SAIR DO APP"
                    );
                    int choose = input.nextInt();
                    switch(choose) {
                        case 1:
                            person.checkBalance();
                            break;
                        case 2:
                            person.makeDeposit();
                            break;
                        case 3:
                            person.withdrawMoney(10);
                            break;
                        case 4:
                            continue_ = false;
                            break;
                        default:
                            System.out.println("Por favor tente digitar um valor valido!");
                            break;
                    }
                }
            }
        } else {
            System.out.println("Não e posivel criar conta");
        }
    }
    
    public static void actionForUser(Object person, Object input) {

    }
}

public class GerenciaBanco {

    public static void main(String[] args) {
        // instanciando classe depois criar banco de dados sql
        Manager person_manager = new Manager("Daniel", "Tenório", 19, "000.000.000-00");
        Scanner input = new Scanner(System.in);
        int choose_action = input.nextInt();
        if (choose_action == 1) {
            person_manager.createUser();
        } else {
            System.out.println("Obrigado volte sempre")
        }
    }
}
