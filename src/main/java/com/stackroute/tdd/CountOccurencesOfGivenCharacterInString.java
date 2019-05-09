// program to count the total number of occurrences of a
// given character in a ​ string
// without using any loop

package com.stackroute.tdd;

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurencesOfGivenCharacterInString {
    public static void main(String[] args) {


        System.out.println("enter the string");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();
        char[] array = new char[10];
        array = sentence.toCharArray();
        System.out.println("enter the character to count");
        char character = input.next().charAt(0);//read the character to count


        HashMap<Character, Integer> occurences = new HashMap<Character, Integer>();

        for (char c : array) {
            if (occurences.containsKey(c)) {//checking for a character in hashmap
                occurences.put(c, occurences.get(c) + 1);//if found increment the value for that character in hashmap
            }

            else {
                occurences.put(c, 1);//if not found  put character in hashmap and assign its value as 1
            }
        }


        System.out.println("the number of" + character);
        System.out.println(occurences.get(character));//print the count of occurences of given character


    }
}
