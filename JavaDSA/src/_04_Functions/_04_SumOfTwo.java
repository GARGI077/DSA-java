package _04_Functions;

import java.util.Scanner;

public class _04_SumOfTwo {

    static int SumTwo(int a,int b)
    {
        return a + b;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter first Number ");
        int x=in.nextInt();
        System.out.println("Enter second number");
        int y=in.nextInt();
        int sum=SumTwo(x,y);
        System.out.println("First number = "+x+"\nSecond number = "+y+"\nSum = "+sum);
        in.close();
    }
}
