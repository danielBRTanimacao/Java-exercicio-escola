package com.daniel;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // numberGuessGame(10);
        russianRoullet(1, 6);
    }

    public static void russianRoullet(int numberOfBullet, int bulletCapacity) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Digite um valor para apostar!");
        double valueTrade = scanner.nextDouble();

        int attempts = 0;
        while (true) {
            System.out.println("[0] Para disparar!\n[1] Para se salvar!");
            int response = scanner.nextInt();

            if (response == 0) {
                int randomShoot = rand.nextInt(bulletCapacity+numberOfBullet);
                attempts++;
                if (attempts > (bulletCapacity - 1)) {
                    System.out.println("Você foi de vasco ultima bala!");
                    break;
                }
                if (randomShoot >= bulletCapacity) {
                    System.out.println("Você foi de vasco tiro número: " + attempts);
                    break;
                }
                System.out.println("Ufá... está vivo slot número " + attempts);
                valueTrade *= attempts;
            } else {
                System.out.println("você ganhou R$" + valueTrade);
                break;
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