package com.daniel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Des001 {
    public static void main(String[] args) {
        Number[] list = {1.5, 3.2, 4.2, 5, 6, 7, -2}; // Coleta qualquer tipo de numero
        List<Integer> evenNumbers = getEvenNumbers(list);
        System.out.println(evenNumbers);
    }

    public static List<Integer> getEvenNumbers(Number[] listOfNumbers){
        return Arrays.stream(listOfNumbers)
                .filter(n -> n.intValue() % 2 == 0)
                .map(Number::intValue)
                .collect(Collectors.toList());
    }
}
