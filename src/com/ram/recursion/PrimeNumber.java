package com.ram.recursion;

public class PrimeNumber {
    public static void main(String[] args) {
        int num = 98 ;
        System.out.println(isPrime(num,num/2));
    }

    public static boolean isPrime(int num, int i) {
        if (i == 1) {
            return true;
        } else if (num < 2) {
            return false;
        } else if (num % i == 0) {
            return false;
        } else{
            return isPrime(num, i - 1);
        }
    }
}
