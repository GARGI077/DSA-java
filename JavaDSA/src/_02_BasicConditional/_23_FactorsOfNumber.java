package _02_BasicConditional;

import java.util.Scanner;

public class _23_FactorsOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number ");
        int num=sc.nextInt();
        int i=1;
        while(i<=num)
        {
            if (num%i==0)
                System.out.println(i);
            i++;
        }
   sc.close();

    }
}
