package _03_Conditional_loops;

import java.util.Scanner;

public class _25_SumOfDigits {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("enter number ");
        int num=in.nextInt();
        int rem,sum=0,temp=num;
        while(num!=0){
             rem=num%10;
             sum=sum+rem;
             num=num/10;

        }
        System.out.println("Sum of Digits of "+temp+" is "+sum);
    }
}
