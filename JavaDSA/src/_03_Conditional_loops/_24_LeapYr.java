package _03_Conditional_loops;

import java.util.Scanner;

public class _24_LeapYr {
    public static void main(String[] args) {
        int year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Year: ");
        year = sc.nextInt();

        if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Entered year is a leap year");
        else
            System.out.println("OOPS!!....Entered year is not a leap year");

    sc.close();
    }
}
