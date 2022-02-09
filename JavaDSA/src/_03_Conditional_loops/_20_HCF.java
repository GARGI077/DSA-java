package _03_Conditional_loops;

import java.util.Scanner;

public class _20_HCF {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Num 1");
        int a=in.nextInt();
        System.out.println("Enter Num 2");
        int b=in.nextInt();
        int num1=a,num2=b;
        int rem;
        while (a%b!=0)
        {
            rem=a%b;
            a=b;
            b=rem;
        }

        int hcf=b;

        System.out.println("HCF of "+ num1 +" & "+ num2 + " is " + hcf );

        in.close();
    }
}
