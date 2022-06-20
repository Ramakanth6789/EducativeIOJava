package com.ram.datastructures.strings;

public class ReverseWords {

    public static String reverseWords(char[] sentence) {
        for (int i = 0; i < sentence.length/2; i++) {
            char temp = sentence[i];
            sentence[i] = sentence[sentence.length-i-1] ;
            sentence[sentence.length-i-1] = temp;
        }

        return String.valueOf(sentence);
    }

    public static void main(String[] args){
        String stringToReverse1 = "Hello World!";
        System.out.println("1.    Actual string:   " + stringToReverse1);
        char[] stringChar = stringToReverse1.toCharArray();

        System.out.println("      Reversed string: " + reverseWords(stringChar));
        System.out.println(
                "\n-----------------------------------------------------------------------------------------------------\n");
        String stringToReverse2 = "The quick brown fox jumped over the lazy dog.";
        System.out.println("2.    Actual string:   " + stringToReverse2);
        stringChar = stringToReverse2.toCharArray();

        System.out.println("      Reversed string: " + reverseWords(stringChar));
        System.out.println(
                "\n-----------------------------------------------------------------------------------------------------\n");


    }
}
