package com.botvin;

import com.botvin.model.Array;
import com.botvin.repository.ArrayManipulations;
import com.botvin.model.Lock;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the size of array that you want to create. " +
                "The size can't be more than 10.");
        int arraySize = Integer.parseInt(scanner.nextLine());

        ArrayManipulations arrayManipulations = new ArrayManipulations();
        Array randomArray = arrayManipulations.create(arraySize);
        ArrayManipulations.print(randomArray);

        System.out.println("Choose the sorting option: 1 - ascending, 2 - descending");
        int sortType = Integer.parseInt(scanner.nextLine());
        if (sortType == 1) {
            arrayManipulations.ascendingSort(randomArray);
        } else if (sortType == 2) {
            arrayManipulations.descendingSort(randomArray);
        }

        arrayManipulations.raiseToCubeEach3Number(randomArray);

        Lock lock = new Lock(randomArray.getIntArray());
        lock.printArray(randomArray.getIntArray());

        lock.getArray()[0] = 10;
        lock.printArray(randomArray.getIntArray());

    }
}