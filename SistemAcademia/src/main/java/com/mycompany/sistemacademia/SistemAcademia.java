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
        Scanner inputage = new Scanner(System.in);
        System.out.println("Informe um dia: ");
        int day = inputage.nextByte();
        caseSwitch(day);
        forCase();
    }
    
    public static void maiorIdade(int number) {
        if(number >= 18) {
            System.out.println("Maior que 18");
        } else {
            System.out.println("Menor de 18");
        }
    }
    
    public static void caseSwitch(int day) {
        
        switch (day) {
            case 1:
              System.out.println("Monday");
              break;
            case 2:
              System.out.println("Tuesday");
              break;
            case 3:
              System.out.println("Wednesday");
              break;
            case 4:
              System.out.println("Thursday");
              break;
            case 5:
              System.out.println("Friday");
              break;
            case 6:
              System.out.println("Saturday");
              break;
            case 7:
              System.out.println("Sunday");
              break;
          }
    }
    
    public static void forCase() {
        System.out.println("hello");
    }
}
