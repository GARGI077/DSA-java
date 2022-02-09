package _03_Conditional_loops;

import java.util.Scanner;

public class _13_AddTwo {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter num 1 ");
        int a= in.nextInt();
        System.out.println("Enter num 2 ");
        int b=in.nextInt();
        int sum=a+b;
        System.out.println("Sum of two no is "+sum);

        in.close();

    }
}
