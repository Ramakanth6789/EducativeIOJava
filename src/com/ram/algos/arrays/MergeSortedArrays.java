package com.ram.algos.arrays;

public class MergeSortedArrays {
    /*
    In this problem, given two sorted arrays, you have to implement the int[] mergeArrays(int[] arr1, int[] arr2) method,
    which returns an array consisting of all elements of both arrays in a sorted way.
    */
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 6, 7, 8};
        int[] result = resultArray(arr1, arr2);
        for (int a : result) {
            System.out.println(a);
        }
    }

    public static int[] resultArray(int[] arr1, int[] arr2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int s1 = arr1.length;
        int s2 = arr2.length;
        int[] result = new int[s1 + s2];

        while (j < s1 && k < s2) {
            if (arr1[j] < arr2[k]) {
                result[i++] = arr1[j++];
            } else {
                result[i++] = arr2[k++];
            }

        }
        while (j < s1) {
            result[i++] = arr1[j++];
        }
        while (k < s1) {
            result[i++] = arr2[k++];
        }

        return result;
    }
}
