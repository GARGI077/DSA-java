package _02_BasicConditional;

import java.util.Scanner;

public class _10_PerimeterOfParallelogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length ");
        int l=sc.nextInt();
        System.out.println("Enter the width ");
        int b=sc.nextInt();
        int perimeter=2*(l+b);
        System.out.println("Length = "+l+"\nBreadth = "+b+"\nPerimeter = "+perimeter);

        sc.close();
    }
}
