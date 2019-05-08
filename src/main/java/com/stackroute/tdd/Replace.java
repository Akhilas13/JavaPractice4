package com.stackroute.tdd;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        System.out.println("enter the string to replace");
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        String replaceString1=s.replace('d','f');
        String replaceString2=replaceString1.replace('l','t');
        System.out.println(replaceString2);
    }
}
