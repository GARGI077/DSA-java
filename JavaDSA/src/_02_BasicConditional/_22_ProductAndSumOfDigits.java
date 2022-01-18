package _02_BasicConditional;

import java.util.Scanner;

public class _22_ProductAndSumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int n=num;
        int pod=1;
        int sod=0;
        while(num!=0)
        {
            int temp=num%10;
            pod=pod*temp;
            sod+=temp;
            num=num/10;

        }

        System.out.println("Product of Digits = "+pod+"\nSum of Digits = "+sod);
        int result=pod-sod;
        System.out.println("Product of Digits - Sum of Digit = "+result);
    }
}
