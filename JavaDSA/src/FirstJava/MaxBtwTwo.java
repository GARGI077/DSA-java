package FirstJava;

import java.util.Scanner;

    public class MaxBtwTwo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x,y,max=0;
        System.out.println("enter first number :");
        x=sc.nextInt();
        System.out.println("Enter Second Number :");
        y=sc.nextInt();
        if(x>y)
            max=x;
        else
            max=y;
        System.out.println("Maximum no :"+max);
    }
}
