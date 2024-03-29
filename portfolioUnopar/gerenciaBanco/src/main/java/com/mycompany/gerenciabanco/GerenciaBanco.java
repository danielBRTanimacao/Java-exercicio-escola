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
    private String cpf;
    
    private double cash_balance;

    public Client(String name, String last_name, String cpf) {
        this.name = name;
        this.last_name = last_name;
        this.cpf = cpf;
        this.cash_balance = 0;
    }
}

public class GerenciaBanco {

    public static void main(String[] args) {
        System.out.println("Ola!");
        
    }
}
