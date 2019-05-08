// program to find out the multiple occurrences of the given word in a ​ string
// ​ using Matcher methods.

package com.stackroute.tdd;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountWordOccurance {
    Scanner scan;

    public static void main(String[] args) {
        CountWordOccurance count = new CountWordOccurance();
        count.getCount();
    }

    public void getCount() {
        scan = new Scanner(System.in);
        System.out.println();
        int count = 0;
        String input = "She sells seashells by the seashore";
        String findString = "se";
        Pattern pattern = Pattern.compile(findString, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(input);//finding the occurence of a word in a string

        while (matcher.find()) {
            count++;
            System.out.println("Found " + count + " : " + matcher.start() + "-" + matcher.end());
        }

    }
}
