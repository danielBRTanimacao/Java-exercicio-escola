package com.daniel;

public class Des002 {
    public static void main(String[] args) {
        int firstValue = 0;
        int secondValue = 1;
        int result;

        for (int i = 0; i < 8; i++) {
            result = firstValue + secondValue;
            System.out.println(firstValue + " + " + secondValue + " = " + result);
            secondValue = firstValue;
            firstValue = result;
        }
    }
}
