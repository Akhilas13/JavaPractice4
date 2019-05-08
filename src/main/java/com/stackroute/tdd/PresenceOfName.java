package com.stackroute.tdd;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PresenceOfName {
    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner input=new Scanner(System.in);
        String sentence=input.nextLine();
        PresenceOfName p=new PresenceOfName();
        p.nameHarry(sentence);
    }

    private void nameHarry(String sentence) {

        System.out.printf("Is Harry Here?");
        //if(Pattern.compile("Harry").matcher(sentence).find())
        boolean result=sentence.matches("(?s).*\\bHarry\\b.*");
        if(result)
            System.out.println("True");
        else
            System.out.println("False");
    }



}
