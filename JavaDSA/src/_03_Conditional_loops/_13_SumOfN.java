package _03_Conditional_loops;

import java.util.Scanner;

public class _13_SumOfN {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter the Nth number ");
        int n=in.nextInt();

        int sum=n*(n+1)/2;

        System.out.println("Sum of N numbers :"+sum);
    }
}
