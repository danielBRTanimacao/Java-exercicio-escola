package com.daniel;

public class Acess {
    public static final int TERMINAL_LENGTH = 50;
    public static void main(String[] args) {
        printCenter(ConsoleColors.BLACK + "========================================" + ConsoleColors.RESET);
        printCenter(ConsoleColors.GREEN + "MODIFICADORES DE ACESSO" + ConsoleColors.RESET);
        System.out.println(" PUBLIC - PRIVATE - PROTECTED - DEFAULT");
        printCenter(ConsoleColors.BLACK + "========================================" + ConsoleColors.RESET);

        Car car = new Car();
    }

    public static void printCenter(String text) {
        int espacos = (TERMINAL_LENGTH - text.length()) / 2;
        if (espacos < 0) espacos = 0;
        System.out.println(" ".repeat(espacos) + text);
    }
}
