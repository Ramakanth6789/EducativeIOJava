package com.ram.datastructures.arrays;

public class RemoveEvenIntegers {
    /*
    In this problem, you have to implement the int [] removeEven(int[] arr) method, which removes all the even elements from the array and returns back updated array.
    */
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 10, 6, 3};
        int[] result = removeEven(arr);
        for (int a : result) {
            System.out.println(a);
        }
    }

    public static int[] removeEven(int[] arr) {
        int oddElement = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                oddElement++;
            }
        }
        int[] result = new int[oddElement];
        int j=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                result[j] = arr[i];
                j++;
            }
        }
        return result;
    }
}
