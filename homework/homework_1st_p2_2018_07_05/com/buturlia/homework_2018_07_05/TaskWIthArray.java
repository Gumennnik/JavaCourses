package com.buturlia.homework_2018_07_05;

import java.util.Random;

public class TaskWIthArray {
    private int[] array;

    public TaskWIthArray(int arraySize) {
        this.array = new int[arraySize];
    }

    public void generateArray() {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = 1 +  rand.nextInt(9);
        }
        System.out.println(" Our array is");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
        System.out.println("");

        return;
    }

    public void printReversedArray()
    {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + ", ");
        }

        return;
    }



}
