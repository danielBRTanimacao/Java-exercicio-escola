/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemacademia;

/**
 *
 * @author danie
 */

import java.util.Scanner;

public class SistemAcademia {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int age = input.nextInt();
        maiorIdade(age);
    }
    
    public static void maiorIdade(int number) {
        if(number >= 18) {
            System.out.println("Maior que 18");
        } else {
            System.out.println("Menor de 18");
        }
    }
    
    public static void contador() {
        System.out.println("lista");
    }
}
