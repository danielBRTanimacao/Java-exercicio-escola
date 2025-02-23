package com.daniel;

public class Des003 {
    public static void main(String[] args) {
        // A = p . (r ** 2)
        double pi = 3.14;
        double ordinalValue = 5;
        double radio = ordinalPow(ordinalValue, 2);
        double area = pi * radio;
        
        System.out.println("Calculando area de um circulo...");
        System.out.println("A = p * r(2)");
        System.out.println("A = " + pi + " x " + ordinalValue + "(2)");
        System.out.println("A = " + pi + " x " + radio);
        System.out.println("A = " + area);
    }

    public static double ordinalPow(double number, int ordinal) {
        double result = number;

        for (int i = 1; i < ordinal; i++) {
            result *= number;
        }
        return result;
    }
}
