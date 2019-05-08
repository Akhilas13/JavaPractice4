package com.stackroute.tdd;

import java.util.HashMap;
import java.util.Scanner;

public class CountOccurences {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner input=new Scanner(System.in);
        String sentence=input.nextLine();
        char[] array=new char[10];
        array = sentence.toCharArray();
        System.out.println("enter the character to count");
        char character = input.next().charAt(0);
        HashMap<Character, Integer> occurences = new HashMap<Character, Integer>();
        for(char c:  array ){
            if(occurences.containsKey(c)){
                occurences.put(c, occurences.get(c) + 1);
            }
            else{
                occurences.put(c,1);
            }
        }
        System.out.println("the number of" +character);
        System.out.println(occurences.get(character));



    }
}
