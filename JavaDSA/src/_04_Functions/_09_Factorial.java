package _04_Functions;

import java.util.Scanner;

public class _09_Factorial {
    static public void fact(int num){

        int f=1;
        while(num!=0)
        {
            f= (int) (f*num);
            System.out.print(num);
            num--;
            if(num>0)
            System.out.print(" * ");
        }
        System.out.print( " = "+f);
    }

    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter any number ");
        int num=in.nextInt();


        System.out.println("Facotial of is");
        fact(num);
    }
}
