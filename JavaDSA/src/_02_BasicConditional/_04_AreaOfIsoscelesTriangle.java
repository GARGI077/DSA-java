package _02_BasicConditional;

import java.util.Scanner;

public class _04_AreaOfIsoscelesTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter height");
        int h=sc.nextInt();
        System.out.println("enter base");
        int b=sc.nextInt();
        double area=0.5*b*h;
        System.out.println("Height = " +h+"\nBase = "+b+"\nArea = "+area);
    }
}
