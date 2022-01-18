package _02_BasicConditional;

import java.util.Scanner;

public class _25_ {
    public static void main(String[] args) {
        //Take integer inputs till the user enters 0 and print the largest number from all.
        Scanner sc = new Scanner(System.in);
        //int product=1;
        int num,temp,max=0;
        System.out.println("Enter a number ");
        do{
            num=sc.nextInt();
            temp=num;
            if(temp>max)
                max=temp;
        }while(num!=0);
        System.out.println("Maximum number entered till n "+max);
    }
}
