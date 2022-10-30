package com.ram.recursion;

import java.util.*;

public class PalindromeCheck {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter the string");
        String text = scanner.next();
        System.out.println(isPalindrome(text));

    }

    public static boolean isPalindrome(String text) {
        if (text.length() == 0 || text.length() == 1) {
            return true;
        } else {
            if (text.charAt(0) == text.charAt(text.length() - 1)) {
                return isPalindrome(text.substring(1, text.length() - 1));
            }
        }
        return false;
    }
}
