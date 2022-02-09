package _02_BasicConditional;

import java.util.Scanner;

public class _06_AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int h,b;
        System.out.println("Enter height of the rhombus");
        h=sc.nextInt();
        System.out.println("Enter base of the rhombus");
        b=sc.nextInt();
        double area=0.5*b*h;
        System.out.println("Base :: "+b+"\nHeight :: "+h+"\nArea of triangle :: "+area);

        sc.close();
    }
}
