package com.daniel;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        int counter = 1;
        System.out.println("==========================");
        System.out.println(ConsoleColors.BLACK_BOLD + "Você tem " + ConsoleColors.GREEN + "5" + ConsoleColors.RESET + ConsoleColors.BLACK_BOLD + " tentativas!" + ConsoleColors.RESET);
        while (counter < 6) {
            System.out.println("==========================");
            System.out.println(ConsoleColors.BLACK_BOLD + "Digite um valor de 0 a 10:" + ConsoleColors.RESET);
            System.out.println("==========================");

            int randomValue = getRandomValue();
            int valueChoiced;

            try {
                valueChoiced = userChosedValue();
            } catch (InputMismatchException e) {
                System.out.println(ConsoleColors.YELLOW + "INVALIDO!" + ConsoleColors.RESET + " Digite um valor valido não pode conter caracteres");
                continue;
            }

            if (valueChoiced > 10 || valueChoiced < 0) {
                System.out.println(ConsoleColors.YELLOW + "INVALIDO!" + ConsoleColors.RESET + " o valor não pode ser maior que 10 ou menor que 0 ");
                counter++;
            }
            else if (randomValue == valueChoiced) {
                System.out.println(ConsoleColors.GREEN + "ACERTOU!" + ConsoleColors.RESET + " o valor e " + randomValue);
                break;
            } else {
                System.out.println(ConsoleColors.RED + "ERROU! " + ConsoleColors.RESET + counter +"/5 tentativas" + " o valor era " + randomValue);
                counter++;
            }
        }
    }

    public static int getRandomValue() {
        Random rand = new Random();
        int n = rand.nextInt(10);
        return n;
    }

    public static int userChosedValue() {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        // read.close();
        return n;
    }
}
