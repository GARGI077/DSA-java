package _02_BasicConditional;

import java.util.Scanner;

public class _12_PerimeterOfSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side");
        int side=sc.nextInt();
        int perimeter=4*side;
        System.out.println("Side = "+side+"\nPerimeter = "+perimeter);

        sc.close();
    }
}
