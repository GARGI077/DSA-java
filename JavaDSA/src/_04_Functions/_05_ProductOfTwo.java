package _04_Functions;

import java.util.Scanner;

public class _05_ProductOfTwo {

    static int ProductTwo(int a,int b)
    {
        return(a*b);
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter First Number ");
        int a=in.nextInt();
        System.out.println("Enter Second Number ");
        int b=in.nextInt();

        int product=ProductTwo(a,b);
        System.out.println("First Number = "+a+"\nSecond Number = "+b+"\nProduct = "+product);

        in.close();


    }
}
