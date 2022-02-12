package _04_Functions;

import java.util.Scanner;

public class _14_SumofN {
    static int SumN(int n)
    {
        int sum=n*(n+1)/2;
        return sum;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("enter the n th term ");
        int n=in.nextInt();
        int sum=SumN(n);
        System.out.println("Sum of  N terms "+sum);
        in.close();
    }
}
