package _03_Conditional_loops;

import java.util.Scanner;

public class _18_Palindrome {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);

        System.out.println("enter the number ");
        int num=in.nextInt();

        int rev=0,temp=num,rem;

        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println("Number is Palindrome ");
        }

    in.close();
    }
}
