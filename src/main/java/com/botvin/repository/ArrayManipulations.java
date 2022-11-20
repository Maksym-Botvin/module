package com.botvin.repository;

import com.botvin.model.Array;

import java.util.Arrays;
import java.util.Random;

public class ArrayManipulations {

    private Random random = new Random();

    public Array create(int i) {
        int[] intArray = new int[i];
        for (i = 0; i < intArray.length; i++) {
            intArray[i] = random.nextInt(-100, 100);
        }
        Array randomArray = new Array(intArray);
        return randomArray;
    }

    public static void ascendingSort(Array randomArray) {
        int temp = 0;
        for (int i = 0; i < randomArray.getIntArray().length; i++) {
            for (int j = i + 1; j < randomArray.getIntArray().length; j++) {
                if (randomArray.getIntArray()[i] > randomArray.getIntArray()[j]) {
                    temp = randomArray.getIntArray()[i];
                    randomArray.getIntArray()[i] = randomArray.getIntArray()[j];
                    randomArray.getIntArray()[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(randomArray.getIntArray()) + " - ascending sorted array");
    }

    public static void descendingSort(Array randomArray) {
        int temp = 0;
        for (int i = 0; i < randomArray.getIntArray().length; i++) {
            for (int j = i + 1; j < randomArray.getIntArray().length; j++) {
                if (randomArray.getIntArray()[i] < randomArray.getIntArray()[j]) {
                    temp = randomArray.getIntArray()[i];
                    randomArray.getIntArray()[i] = randomArray.getIntArray()[j];
                    randomArray.getIntArray()[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(randomArray.getIntArray()) + " - descending sorted array");
    }

    public static void raiseToCubeEach3Number(Array randomArray) {
        int i = 2;
        for (; i < randomArray.getIntArray().length; i += 3) {
            randomArray.getIntArray()[i] = (int) Math.pow(randomArray.getIntArray()[i], 3);
        }
        System.out.println(Arrays.toString(randomArray.getIntArray()) + " - sorted array where each 3th value is raised to the 3rd power");
    }

    public static void print(Array randomArray) {
        System.out.println(Arrays.toString(randomArray.getIntArray()));
    }
}