package _01_FirstJava;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number : ");
        double a= sc.nextDouble();
        System.out.println("Enter second number : ");
        double b= sc.nextDouble();
        double value;
        System.out.println("enter the operand");
        String op=sc.next();

        if(op.equals('+')){
            value=a+b;
            System.out.println("sum :"+ value);
        }
        else if(op.equals('*')){
            value=a*b;
            System.out.println("Product :"+value);
        }
        else if(op.equals('-'))
        {

            if(a>b)
            value=a-b;
            else
                value=b-a;
            System.out.println("difference :"+value);
        }
        else if(op.equals("/"))
        {
            if (a>b)
                value=a/b;
            else
                value=b/a;
            System.out.println("Quotient : "+value);
        }

        sc.close();
    }
}
