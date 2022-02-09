package _03_Conditional_loops;

import java.util.Scanner;

public class _07_Power {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("enter any number");
        int num= in.nextInt();
        System.out.println("Enter the power u want to calculate");
        int power=in.nextInt();
        int result= (int) Math.pow(num,power);
        System.out.println("Power : "+result);

        in.close();

    }
}
