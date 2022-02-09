package _03_Conditional_loops;

import java.util.Scanner;

public class _21_LCM {
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

        int lcm=(num1*num2)/hcf;

        System.out.println("LCM of "+num1+" & "+ num2 +" is "+lcm);
        in.close();

    }
}
