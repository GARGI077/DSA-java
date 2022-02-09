package _02_BasicConditional;

import java.util.Scanner;

public class _09_PerimeterOfEquilateralTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter side of triangle");
        int side=sc.nextInt();
        int perimeter=3*side;
        System.out.println("Side = "+side+"\nPerimeter = "+perimeter);

        sc.close();
    }
}
