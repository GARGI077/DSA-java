package _03_Conditional_loops;

import java.util.Scanner;

public class _01_Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int fact=1;
        while(num!=0)
        {
            fact=fact*num;
            num--;
        }
        System.out.println("factorial of number "+fact);

        sc.close();
    }
}
