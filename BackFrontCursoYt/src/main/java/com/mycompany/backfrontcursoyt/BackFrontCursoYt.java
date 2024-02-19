package com.mycompany.backfrontcursoyt;

/**
 *
 * @author danie
 */

// Comitando tipos de commit

public class BackFrontCursoYt {
      
    public static void main(String[] args) {
        String person = "Daniel";
        int age = 19;
        float height = 103.4f;
        double high = 1.85;
        char sex = 'M';
        boolean is_legal_age = age >= 18;
        
        double x = 20;
        double y = 3.1;
        int sum = (int) (x + y);
        int subtraction = (int) (x - y);
        int multiplication = (int) (x * y);
        float division = (float) (x / y);
        double division2 = (double) (x / y);
        int rest = (int) (x % y);
        
        System.out.println(sum);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(division2);
        System.out.println(rest);
        
        System.out.println("Hello World!");
        System.out.println("Hi, my name is.. " + person);
        System.out.println("i'm " + age + " years old");
        System.out.println("my height is " + height);
        System.out.println("but my high is " + high);
        System.out.println("my sex is " + sex);
        System.out.println("Am I finally of age? " + is_legal_age);
    }
}