package com.daniel;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        numberGuessGame(10);
    }

    public static void numberGuessGame(int maxValueGuess){
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        int numberToGuess = rand.nextInt(maxValueGuess) + 1;
        int attempts = 0;

        System.out.println("Advinhe um númedo de 1 a " + maxValueGuess);
        while (true) {
            int guess = scan.nextInt();
            attempts++;
            if (guess == numberToGuess) {
                System.out.println("Parabens número correto! número de tentativas " + attempts);
                break;
            } else {
                System.out.println("Valor incorreto! tentativa número " + attempts);
            }
        }
        scan.close();
    }
}