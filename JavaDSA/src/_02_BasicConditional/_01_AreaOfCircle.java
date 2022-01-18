package _02_BasicConditional;

import java.util.Scanner;

import static java.lang.Math.pow;

public class _01_AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the radius");
        int rad=sc.nextInt();
        double pi=3.14;
        double area=pi*pow(rad,2);
        System.out.println("radius = "+rad+"\nArea = "+area);

    }
}
