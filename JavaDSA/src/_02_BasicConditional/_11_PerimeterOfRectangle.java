package _02_BasicConditional;

import java.util.Scanner;

public class _11_PerimeterOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        int l=sc.nextInt();
        System.out.println("enter width");
        int w=sc.nextInt();
        int perimeter=2*(l+w);
        System.out.println("Length ="+l+"\nBreadth = "+w+"\nPerimeter = "+perimeter);
    }
}
