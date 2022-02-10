package _04_Functions;

import java.util.Scanner;

public class _06_Circle {

    static double area(double r)
    {
        double area= 3.14*r*r;
        return area;
    }

    static double circumference(double r)
    {
        double c=2*3.14*r;
        return c;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Enter Radius ");
        int r = in.nextInt();
        double a=area(r);
        double c=circumference(r);

        System.out.println("Radius = "+r+"\nArea = "+a+"\nCircumference = "+c);
    }
}
