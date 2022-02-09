package _03_Conditional_loops;

import java.util.Scanner;

public class _16_NprNcr {

    static public double fact(double num){

        int f=1;
        while(num!=0)
        {
            f= (int) (f*num);
            num--;
        }
        return f;
    }
    public static void main(String[] args) {


        Scanner in=new Scanner(System.in);
        System.out.println("enter n ");
        double n=in.nextInt();
        System.out.println("enter r ");
        double r=in.nextInt();

        double ncr=(fact(n))/(fact(n-r)*fact(r));
        double npr=(fact(n))/(fact(n-r));

        System.out.println("nCr "+ncr);
        System.out.println("nPr "+ npr);

    }

}
