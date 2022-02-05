package _03_Conditional_loops;

import java.util.Scanner;

public class _16_ReverseofString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       System.out.println("Enter String to input ");

        String s= input.nextLine();

        String rev="";
        char c;

        for (int i=0;i<s.length();i++)
        {
            c=s.charAt(i);
            rev=c+rev;
        }

        System.out.println("Reverse of string "+rev);


    }

}
