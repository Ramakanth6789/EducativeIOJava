package com.ram.recursion;

import java.util.*;

public class DecimalToBinary {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter decimal number");
        int n = scanner.nextInt();
        int result = decimalToBinary(n);
        System.out.println(String.format("The Binary number for %d is %d", n, result));
    }

    public static int decimalToBinary(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (n % 2 + 10 * decimalToBinary(n / 2));
        }
    }

}
