package _02_BasicConditional;

import java.util.Scanner;

public class _16_volumeOfCylinder {
    public static void main(String[] args) {
        // volume of cylinder
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double radius = sc.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double height = sc.nextDouble();
        double volume = Math.PI * (radius * radius) * height;
        System.out.println("The volume of the cylinder is: " + volume);
        sc.close();
    }
}
