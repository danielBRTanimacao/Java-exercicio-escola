/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemacademia;

/**
 *
 * @author danie
 */
public class SistemAcademia {

    public static void main(String[] args) {
        maiorIdade(10);
    }
    
    public static void maiorIdade(int number) {
        if(number >= 18) {
            System.out.println("Maior que 18");
        } else {
            System.out.println("Menor de 18");
        }
    }
}
