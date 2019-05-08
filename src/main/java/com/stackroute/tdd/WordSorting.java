 //program that ​ sets​ up a ​ String​ variable containing a paragraph of text of your choice.
 //a. Extract the words from the text and sort them into alphabetical order.
 //b. Display the sorted list of words.
package com.stackroute.tdd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordSorting {
    public static void main(String[] args) {
        System.out.println("enter the paragraph");
        Scanner input = new Scanner(System.in);
        String paragraph = input.nextLine();//read the paragraph
        ArrayList<String> wordArrayList = new ArrayList<String>();
        for (String word : paragraph.split(" ")) {
            wordArrayList.add(word);
        }
        Collections.sort(wordArrayList);//sort the list in alphabetical order
        System.out.println(wordArrayList);
    }
}
