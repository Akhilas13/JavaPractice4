//program to reverse the given string
package com.stackroute.tdd;

import java.util.Scanner;

public class Transpose {
    StringBuilder reverseString = new StringBuilder();

    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();//read the string
        String[] array = new String[20];
        array = sentence.split(" ");//split the string with space and assign the words to string array
        Transpose t = new Transpose();
        t.reverse(array);
    }

    private void reverse(String[] array) {
        for (String word : array) {
            String reverseWord = new StringBuilder(word).reverse().toString();//reverse each word in array
            reverseString.append(reverseWord + " ");
        }

        System.out.println(reverseString.toString().trim());
    }

}





