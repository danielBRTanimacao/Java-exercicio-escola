// package com.daniel;

// import java.io.IOException;
// import java.util.Random;
// import java.util.Scanner;

// public class TwentyOneGame {
//     public static void main(String[] args) {
//         Cards card = new Cards();
//         Scanner read = new Scanner(System.in);

//         System.out.println(ConsoleColors.BLACK + "=================" + ConsoleColors.RESET);
//         System.out.println(ConsoleColors.BLACK_BOLD + "---- 21" + ConsoleColors.RESET + " GAME " + ConsoleColors.BLACK_BOLD  + "----" + ConsoleColors.RESET);
//         System.out.println(ConsoleColors.BLACK + "=================" + ConsoleColors.RESET);

//         System.out.println("--------" + ConsoleColors.BLACK_BOLD +  " Primeiro jogador " + ConsoleColors.RESET + "--------");
//         String player1Name = read.nextLine();
//         Player p1 = new Player(player1Name);
//         clear();
        
//         System.out.println("-------- " + ConsoleColors.BLACK_BOLD + "Segundo jogador" + ConsoleColors.RESET + " -------- \nDIGITE [0] para um BOT: ");
//         String player2Name = read.nextLine();
//         Player p2 = new Player(player2Name);
//         if (player2Name.equalsIgnoreCase("0")) {
//             p2.name = "BOT";
//         }
        
//         int playerTime = 0;
//         Player[] playersLocal = {p1, p2};
//         while (true) {
//             if (playersLocal[0].count > 21) {
//                 System.out.println(ConsoleColors.BLACK + "=====================" + ConsoleColors.RESET);
//                 System.out.println("O GANHADOR foi " + playersLocal[1].name);
//                 System.out.println(ConsoleColors.BLACK + "=====================" + ConsoleColors.RESET);
//                 break;
//             } else if (playersLocal[1].count > 21) {
//                 System.out.println(ConsoleColors.BLACK + "=====================" + ConsoleColors.RESET);
//                 System.out.println("O GANHADOR foi " + playersLocal[0].name);
//                 System.out.println(ConsoleColors.BLACK + "=====================" + ConsoleColors.RESET);
//                 break;
//             }
//             clear();
//             System.out.println("Contador: " + playersLocal[0].count + " " + playersLocal[0].name);
//             System.out.println("Contador: " + playersLocal[1].count + " " + playersLocal[1].name);

//             System.out.println("Deseja pegar uma carta [S] Sim [N] Não? Jogador " + playersLocal[playerTime].name);
//             String choose = read.nextLine();
//             if (choose.equalsIgnoreCase("S")) {
//                 playersLocal[playerTime].count += card.getCard();
//                 System.out.println("Seu contador: " + playersLocal[playerTime].count);
//             } else if (playersLocal[0].skip == true || playersLocal[1].skip == true) {
//                 if (playersLocal[0].count > playersLocal[1].count) {
//                     System.out.println("O ganhador foi " + playersLocal[0].name);
//                     break;
//                 } else if (playersLocal[0].count == playersLocal[1].count) {
//                     System.out.println("DEU EMPATE");
//                     break;
//                 } else if (playersLocal[0].count < playersLocal[1].count) {
//                     System.out.println("O ganhador foi " + playersLocal[1].name);
//                     break;
//                 }
//             } else {
//                 playersLocal[playerTime].skip = true;
//                 System.out.println("Jogador " + playersLocal[playerTime].name + " finalizou sua mão...");
//                 if (playerTime == 0) {
//                     playerTime = 1;
//                 } else {
//                     playerTime = 0;
//                 }
//             }
//         }
        
//         read.close();
//     }

//     public static void clear() {
//         try {
//             String os = System.getProperty("os.name").toLowerCase();

//             if (os.contains("windows")) {
//                 new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
//             } else {
//                 new ProcessBuilder("clear").inheritIO().start().waitFor();
//             }
//         } catch (IOException | InterruptedException e) {
//             e.printStackTrace();
//         }
//     }
// }

// class Cards {
//     int[] valueCards = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};

//     public int getCard() {
//         Random rand = new Random();
//         int n = rand.nextInt(11);
//         return valueCards[n];
//     }
// }

// class Player {
//     String name;
//     int count = 0;
//     boolean skip = false;
    
//     public Player(String name){
//         this.name = name;
//     }
// }