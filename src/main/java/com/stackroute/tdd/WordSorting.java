package com.stackroute.tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class WordSorting {
    public static void main(String[] args) {
        System.out.println("enter the paragraph");
        Scanner input=new Scanner(System.in);
        String paragraph=input.nextLine();
        ArrayList<String> wordArrayList = new ArrayList<String>();
        for(String word : paragraph.split(" ")) {
            wordArrayList.add(word);
        }
        Collections.sort(wordArrayList);
        System.out.println(wordArrayList);
    }
}
