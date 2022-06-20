package com.ram.datastructures.arrays;

public class MinValueInArray {
    //    In this problem, you have to implement the int findMinimum(int[] arr) method,
//    which will traverse the whole array and find the smallest number in the array.
    public static void main(String[] args) {
        int[] arr = {9, 2, 3, 6};

        System.out.println(findMinimum(arr));


    }

    public static int findMinimum(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num : arr) {
            min = Math.min(min, num);
        }

        return min;
    }
}
