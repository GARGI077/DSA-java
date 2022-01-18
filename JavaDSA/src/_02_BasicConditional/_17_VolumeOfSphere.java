package _02_BasicConditional;

import java.util.Scanner;

import static java.lang.Math.pow;

public class _17_VolumeOfSphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double pi=3.14;
        System.out.println("enter radius");
        double radius=sc.nextInt();
        double volume=(1.33)*pi*pow(radius,3);
        System.out.println("Radius = "+radius+"\nVolume = "+volume);
    }
}
