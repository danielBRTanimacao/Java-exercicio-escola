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
    
    public void checkBalance() {
        System.out.printf("""
                        Checando o dinheiro que possui...
                        Seus dados ->
                        Nome: %s %s
                        Idade: %d 
                        Cpf: %s """, name, last_name, age, cpf);
    }
    
    public void makeDeposit(double value_deposit) {
        System.out.println("Depositando");
    }
    
    public void withdrawMoney(double value_withdrawn) {
        if (value_withdrawn > 0 && value_withdrawn <= cash_balance) {
            cash_balance -= value_withdrawn;
            System.out.println("Você fez um saque de R$" + value_withdrawn + " foi realizado com sucesso!");
        } else {
            System.out.printf("Não foi possivel fazer o saque, digite um valor valido!");
        }
    }
}

class Manager extends Client {
    
    public Manager(String name, String last_name, int age, String cpf) {
        super(name, last_name, age, cpf);
    }

    public void createUser() {
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
                    System.out.println("""
                                       Bem vindo qual a\u00e7\u00e3o deseja fazer?
                                       1 - Consultar SALDO/STATUS
                                       2 - Fazer DEPOSITO
                                       3 - Fazer um SAQUE
                                       4 - SAIR DO APP""");
                    int choose = input.nextInt();
                    switch(choose) {
                        case 1:
                            person.checkBalance();
                            break;
                        case 2:
                            System.out.println("Digite um valor para depositar: ");
                            double value_deposit = input.nextDouble();
                            person.makeDeposit(value_deposit);
                            break;
                        case 3:
                            System.out.println("Digite um valor para sacar: ");
                            double value_withdrawn = input.nextDouble();
                            person.withdrawMoney(value_withdrawn);
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
}

public class GerenciaBanco {

    public static void main(String[] args) {
        // instanciando classe depois criar banco de dados sql
        Manager person_manager = new Manager("Daniel", "Tenório", 19, "000.000.000-00");
        // input coleta o valor digitado pelo usuario deve ser um valor inteiro
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja criar um usuario? 1[S] 2[N]");
        int choose_action = input.nextInt();
        if (choose_action == 1) {
            // metodo criar usuario classe Manager
            person_manager.createUser();
        } else {
            System.out.println("Obrigado volte sempre");
        }
    }
}
