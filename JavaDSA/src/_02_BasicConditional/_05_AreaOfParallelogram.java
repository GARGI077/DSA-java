package _02_BasicConditional;

import java.util.Scanner;

public class _05_AreaOfParallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter height of paralleogram");
        double h=sc.nextInt();
        System.out.println("enter base of parallelogram");
        double b= sc.nextInt();
        double area=b*h;
        System.out.println("height = "+h+"\nbase = "+b+"\narea = "+area);
    }
}
