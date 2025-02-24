package com.daniel;

import java.util.Scanner;

public class Des006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Modelo do carro:");
        // String carName = scanner.nextLine();
        // System.out.println("Nome:");
        // String carModel = scanner.nextLine();
        // System.out.println("Preço:");
        // double carPrice = scanner.nextDouble();
        System.out.println("Modelo do carro: Toyota");
        String carName = "Toyota";
        System.out.println("Nome: Supra");
        String carModel = "Supra";
        System.out.println("Preço: R$1.400.000,00");
        double carPrice = 1_400_000.00;
        
        Car car = new Car(carModel, carName, carPrice);

        while (true) {
            System.out.println("Escolha a opção:\nCancelar[0]\nParcelar pagamento[1]");
            int chosed = scanner.nextInt();
            if (chosed == 0) {
                break;
            } else if (chosed == 1) {
                System.out.println("Quantas parcelas?");
                for (int i = 1; i < 25; i++) {
                    double division = car.getPrice() / i;
                    if (i>18) {
                        System.out.println("R$" + String.format("%.2f", (division + (division * 0.15))) + " parcelas " + i + "x acrecimo de 15%");
                    }
                    else if (i>12) {
                        System.out.println("R$" + String.format("%.2f", (division + (division * 0.05))) + " parcelas " + i + "x acrecimo de 5%");
                    } else {
                        System.out.println("R$" + String.format("%.2f", division) + " parcelas " + i + "x");
                    }
                }

            }
        }

        scanner.close();
    }
}

class Car {
    private String model;
    private String name;
    private double price;
    
    public Car(String model, String name, double price) {
        this.model = model;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public String getModel() {
        return this.model;
    }

    public double getPrice() {
        return this.price;
    }
}