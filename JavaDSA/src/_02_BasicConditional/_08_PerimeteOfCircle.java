package _02_BasicConditional;

import java.util.Scanner;

public class _08_PerimeteOfCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        System.out.println("Enter radius");
        int radius=sc.nextInt();
        double perimeter=2*pi*radius;
        System.out.println("radius= "+radius+"\nperimeter= "+perimeter);

        sc.close();
    }
}
