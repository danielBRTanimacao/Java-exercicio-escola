package com.daniel;

import java.util.Random;
import java.util.Scanner;

public class TwentyOneGame {
    public static void main(String[] args) {
        Cards card = new Cards();
        Scanner read = new Scanner(System.in);

        System.out.println("================");
        System.out.println("Roletinha");
        System.out.println("================");

        System.out.println("Nome 1: ");
        String player1Name = read.nextLine();
        Player p1 = new Player(player1Name);

        System.out.println("Nome 2 digite [0] para um bot: ");
        String player2Name = read.nextLine();
        Player p2 = new Player(player2Name);
        if (player2Name.equalsIgnoreCase("0")) {
            p2.name = "BOT";
        }
        
        boolean endGame = false;
        int playerTime = 0;
        Player[] playersLocal = {p1, p2};
        while (endGame == false) {
            if (playersLocal[0].count > 21) {
                System.out.println("O ganhador foi " + playersLocal[1].name);
                endGame = true;
            } else if (playersLocal[1].count > 21) {
                System.out.println("O ganhador foi " + playersLocal[0].name);
                endGame = true;
            }
            System.out.println("Contador: " + playersLocal[0].count + " " + playersLocal[0].name);
            System.out.println("Contador: " + playersLocal[1].count + " " + playersLocal[1].name);

            System.out.println("Deseja pegar uma carta [S] Sim [N] Não? Jogador " + playersLocal[playerTime].name);
            String choose = read.nextLine();
            if (choose.equalsIgnoreCase("S")) {
                playersLocal[playerTime].count += card.getCard();
                System.out.println("Seu contador: " + playersLocal[playerTime].count);
            } else {
                System.out.println("Jogador " + playersLocal[playerTime].name + " pulou a vez...");
                if (playerTime == 0) {
                    playerTime = 1;
                } else {
                    playerTime = 0;
                }
            }
        }
        
        read.close();
    }
}

class Cards {
    int[] valueCards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

    public int getCard() {
        Random rand = new Random();
        int n = rand.nextInt(11);
        return valueCards[n];
    }
}

class Player {
    String name;
    int count = 0;
    boolean skip = false;
    
    public Player(String name){
        this.name = name;
    }
}