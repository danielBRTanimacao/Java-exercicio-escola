package com.daniel;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // numberGuessGame(10);
        russianRoullet(1, 6);
    }

    public static void russianRoullet(int numberOfBullet, int capacityOfBullet) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        int addNumber = rand.nextInt(6) + 1;
        Player p1 = new Player("Daniel", false);
        Player p2 = new Player("Bot", false);

        boolean shoted = false;

        while (!shoted) {
            System.out.println(addNumber);
            System.out.println("Digite [0] para atirar em vc mesmo [1] para atirar no companheiro");
            int choosed = scanner.nextInt();

            if (choosed == 0) {
                addNumber+= numberOfBullet;
                System.out.println("...");
                if (addNumber >= capacityOfBullet) {
                    shoted = true;
                    System.out.println("Você esta morto!");
                    break;
                }
                System.out.println("Ufa esta salvo!");
            } else {
                addNumber+= numberOfBullet;
                System.out.println("...");
                if (addNumber >= capacityOfBullet) {
                    shoted = true;
                    System.out.println("Você esta morto!");
                    break;
                }
                System.out.println("Ufa esta salvo!");
            }
        }

        scanner.close();
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