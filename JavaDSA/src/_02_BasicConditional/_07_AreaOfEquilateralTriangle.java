package _02_BasicConditional;

import java.util.Scanner;

import static java.lang.Math.pow;

public class _07_AreaOfEquilateralTriangle {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        System.out.println("enter side");
        int side=sc.nextInt();
        double area=0.433*pow(side,2);
        System.out.println("Side = "+side+"\nArea = "+area);

        sc.close();
    }
}
