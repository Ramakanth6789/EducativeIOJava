package com.ram.datastructures.arrays;

import java.util.*;

public class ArrayOfProducts {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = findProduct(arr);
        Arrays.stream(result).forEach(System.out::println);

    }

    public static int[] findProduct(int[] arr) {
        int product = 1;
        for (int num : arr) {
            product *= num;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = product / arr[i];
        }

        return arr;
    }
}
