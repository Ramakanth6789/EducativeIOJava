package com.ram.datastructures.arrays;

public class FirstRepeatedNumber {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 2, 6, 6};
        System.out.println(firstNonRepeating(arr));

    }

    public static int firstNonRepeating(int[] arr) {
        boolean isRepeated = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isRepeated = true;
                    break;
                }
            }
            if (!isRepeated) {
                return arr[i];
            } else {
                isRepeated = false;
            }
        }
        return -1;
    }
}
