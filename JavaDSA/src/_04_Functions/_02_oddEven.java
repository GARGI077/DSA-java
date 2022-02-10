package _04_Functions;

import java.util.Scanner;

public class _02_oddEven {

     static void OddEven(int num)
    {
        if(num%2!=0)
        {
            System.out.println(" Number :: "+num+" => ODD ");
        }
        if(num%2==0) {
            System.out.println(" Number :: "+num+" => EVEN ");

        }

    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number ");
        int number=in.nextInt();
        OddEven(number);

        in.close();

    }
}
