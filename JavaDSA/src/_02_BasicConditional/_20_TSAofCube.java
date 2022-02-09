package _02_BasicConditional;

import java.util.Scanner;

public class _20_TSAofCube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side of cube");
        double side=sc.nextInt();
        double tsa=6*side*side;
        System.out.println("Total Surface Area Of Cube \nSide ="+side+"\nTotal Surface Area="+tsa);

        sc.close();
    }
}
