package com.botvin;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter the size of array that you want to create. " +
                "The size can no be more than 10.");
        // 1. Користувач вводить розмір масиву в консоль (i >= 10)
        int i = Integer.parseInt(scanner.nextLine());
        checkSize(i);

        int[] randomArray = returnRandomArray(i);
        System.out.println(Arrays.toString(randomArray) + " random array"); // 3. Вивести масив на екран

        // 4. Користувачеві пропонується вибрати спосіб сортування за зростанням або спаданням
        System.out.println("Choose the sorting option: 1 - ascending, 2 - descending");
        int sortType = Integer.parseInt(scanner.nextLine());

        // 5. Сортується масив відповідно до вибору (потрібно написати свій алгоритм сортування)
        // 6. Вивести масив на екран
        if (sortType == 1) {
            ascendingSort(randomArray);
        } else if (sortType == 2) {
            descendingSort(randomArray);
        } else {
            System.out.println("You choose wrong type of sorting. Please, try again.");
        }

        // 7. Кожне третє число масиву возвести в куб
        // 8. Вивести масив на екран
        raiseToCubeEach3Number(randomArray);

        System.out.println();

        Lock lock = new Lock(randomArray);
        lock.printArray(randomArray); // відобразили масив

        lock.getArray()[0] = 10;    // змінюємо значення елемента масива
        lock.printArray(randomArray); // та відображаємо його, елемент масиву не повинен змінитися

    }

    static void checkSize(int i) {
        if (i <= 0 || i > 10) {
            System.out.println("You entered wrong size of array! Please try again.");
        }
    }

    public static int[] returnRandomArray(int i) { // 2. Метод заповнює масив випадковими числами в діапазоні [-100; 100]
        Random random = new Random();
        int[] array = new int[i];
        for (i = 0; i < array.length; i++) {
            array[i] = random.nextInt(-100, 100);
        }
        return array;
    }

    public static void ascendingSort(int[] intArray) {
        int temp = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] > intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intArray) + " ascending sorted array");
    }

    public static void descendingSort(int[] intArray) {
        int temp = 0;
        for (int i = 0; i < intArray.length; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                if (intArray[i] < intArray[j]) {
                    temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(intArray) + " descending sorted array");
    }

    public static void raiseToCubeEach3Number(int[] intArray) {
        int i = 2;
        for (; i < intArray.length; i += 3) {
            intArray[i] = intArray[i] * intArray[i] * intArray[i];
        }
        System.out.println(Arrays.toString(intArray) + " array where each 3rd number raised to 3 power");
    }
}