package _03_Conditional_loops;

import java.util.Scanner;

public class _04_Discount {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the List price of product");
        double lp=sc.nextInt();
        System.out.println("Enter the Discount of product");
        double discount=sc.nextInt();
        double discount_amount=(lp*discount)/100;
        double sale_price=lp-discount_amount;
        System.out.println("Price after discount "+sale_price);

        sc.close();

    }
}
