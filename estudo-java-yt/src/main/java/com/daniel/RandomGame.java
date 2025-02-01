package com.daniel;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomGame {
    public static void main(String[] args) {
        int maxValueSort = 20;
        int chosedNumber = 5;

        System.out.println(sortListInts(maxValueSort, chosedNumber));
    }

    public static List<String> sortListInts(int maxValueSort, int chosedNumber) {
        List<String> result = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < chosedNumber; i++) {
            int randInt = rand.nextInt(maxValueSort);
            result.add(String.valueOf(randInt));
        }

        return result;
    }
}
