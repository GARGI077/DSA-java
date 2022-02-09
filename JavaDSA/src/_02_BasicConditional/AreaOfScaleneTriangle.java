package _02_BasicConditional;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class AreaOfScaleneTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter side a :: ");
        int a=sc.nextInt();
        System.out.println("enter side b :: ");
        int b=sc.nextInt();
        System.out.println("enter side c :: ");
        int c=sc.nextInt();
        double s=(a+b+c)/2;
        double x=s-a;
        double y=s-b;
        double z=s-c;
        double area=sqrt(s*x*y*z);
        System.out.println("A = "+a+"\nB = "+b+"\nC = "+c+"\nArea ="+area);

        sc.close();
    }
}
