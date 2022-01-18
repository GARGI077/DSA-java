package _01_FirstJava;

import java.util.Scanner;

public class InrToUsd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter INR ");
        double inr=sc.nextInt();
        double usd=inr*0.013;
        System.out.println("INR to USD "+usd +"$");

    }
}
