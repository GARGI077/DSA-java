package _02_BasicConditional;

import java.util.Scanner;

public class _14_VolumeOfCone {
    public static void main(String[] args) {
        double pi=3.14;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter height ");
        double h=sc.nextInt();
        System.out.println("enter radius");
        double rad=sc.nextInt();
        double volume=(0.3)*pi*rad*rad*h;
        System.out.println("Radius of cone = "+rad+"\n Height of cone = "+h+"\nVolume = "+volume);
    }
}
