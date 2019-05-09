//program with the implementation of ​ Regular Expression​
// find the presence of the name Harry in a ​ string

package com.stackroute.tdd;

import java.util.Scanner;

public class PresenceOfNameHarryInString {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();//read the string
        PresenceOfNameHarryInString presenceOfNameHarry = new PresenceOfNameHarryInString();
        presenceOfNameHarry.nameHarry(sentence);
    }

    private void nameHarry(String sentence) {

        System.out.printf("Is Harry Here?");
        boolean result = sentence.matches("(?s).*\\bHarry\\b.*");//checks for the matching of word Harry
        if (result)//if it matches print as true
            System.out.println("True");
        else
            System.out.println("False");//if not false
    }


}
