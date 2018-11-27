package com.luxoft.basics.part3.xtasks;

import com.sun.istack.internal.NotNull;

import java.util.Arrays;

public class T1_Sort {
    public static void main(String[] args) throws Exception {
        int[] numbers = {0, 3, 2, 1, 6, 8, 4, 7, 5, 9};

        System.out.println(Arrays.toString(numbers));
        System.out.println();

        sortAsc(numbers);

        int[] arrToCheck = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Is numbers sorted: " + String.valueOf(Arrays.equals(arrToCheck, numbers)).toUpperCase());
    }

    /**
     * Method should sort data array ascending order.  int n = numbers [i]
     */
    public static void sortAsc(int[] numbers) {
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] > numbers[i+1]) {
                swap(numbers, i, i+1 );
            };
        System.out.print(Arrays.toString(numbers));
    }


    /**
     * Method should exchange values with idx1 and idx2 in data array.
     */
    public static void swap(int[] data, int idx1, int idx2) {
        int temp;
        temp = data[idx1];
        data[idx1] = data [idx2];
        data [idx2] = temp;
    }
}
