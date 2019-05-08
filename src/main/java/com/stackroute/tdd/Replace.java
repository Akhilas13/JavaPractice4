// program to replace all d with f
// all l with t in the given ​ String

package com.stackroute.tdd;

import java.util.Scanner;

public class Replace {
    public static void main(String[] args) {
        System.out.println("enter the string to replace");
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();//read the string
        String replaceString1=s.replace('d','f');//replace d with f
        String replaceString2=replaceString1.replace('l','t');//replace l with t
        System.out.println(replaceString2);
    }
}
