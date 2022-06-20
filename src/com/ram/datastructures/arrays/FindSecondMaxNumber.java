package com.ram.datastructures.arrays;

public class FindSecondMaxNumber {
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 6};
        System.out.println(findSecondMaximum(arr));

    }

    public static int findSecondMaximum(int[] arr) {

        int max = Integer.MIN_VALUE, secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

}
