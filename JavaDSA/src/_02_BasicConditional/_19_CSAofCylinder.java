package _02_BasicConditional;

import java.util.Scanner;

public class _19_CSAofCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        System.out.println("Enter radius");
        double radius=sc.nextInt();
        System.out.println("Enter height");
        double h=sc.nextInt();
        double csa=2*pi*radius*h;
        System.out.println("Curved Surface Area of Cylinder"+"\nRadius = "+radius+"\nHeight = "+h+"\nCurved Surface Area = "+csa);

        sc.close();
    }
}
