package com.botvin.model;

import java.util.Arrays;

public final class Lock {

    private final int[] array;

    public int[] getArray() {
        int[] arrayClone = Arrays.copyOf(array, array.length);
        return arrayClone;
    }

    final public void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public Lock(int[] array) {
        this.array = array;
    }
}