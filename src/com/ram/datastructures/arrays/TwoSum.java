package com.ram.datastructures.arrays;

import java.util.*;

public class TwoSum {
    //    In this problem, you have to implement the int[] findSum(int[] arr, int n) method, which will take a number n,
//    and an array arr as input and returns an array of two integers that add up to n in an array.
//    You are required to return only one such pair. If no such pair is found then simply return the array.
    public static void main(String[] args) {
        int[] arr = {1, 21, 3, 14, 5, 60, 7, 6};
        int[] result = findSum(arr, 27);

        Arrays.stream(result).forEach(System.out::println);
    }

    public static int[] findSum(int[] arr, int n) {
        Map<Integer, Integer> resultant = new HashMap<>();

        for (int num : arr) {
            if (resultant.containsKey(num)) {
                return new int[]{num, resultant.get(num)};
            }
            resultant.put(n - num, num);
        }
        return new int[]{-1, -1};
    }
}
