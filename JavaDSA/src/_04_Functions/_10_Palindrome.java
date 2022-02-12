package _04_Functions;

import java.util.Scanner;

public class _10_Palindrome {
    static boolean isPalindrome(int num)
    {
        int rev=0,temp=num,rem;

        while(num!=0)
        {
            rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(rev==temp)
        {
            return true;
        }
        else
            return false;

    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter Number ");
        int num=in.nextInt();

        if(isPalindrome(num)==true)
        System.out.println("Palindrome Number ");
        else
        {
            System.out.println("Nt a Palindrome ");
        }
    }
}
