package _02_BasicConditional;

import java.util.Scanner;

public class _03_AreaOfRect {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int length,width,area;
        System.out.println("enter length ");
        length=sc.nextInt();
        System.out.println("enter width ");
        width=sc.nextInt();
        area=length*width;
        System.out.println("length = "+length+"\nwidth = "+width+"\narea = "+area);

        sc.close();
    }
}
