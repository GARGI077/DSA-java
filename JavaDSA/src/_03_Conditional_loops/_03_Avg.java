package _03_Conditional_loops;

import java.util.Scanner;

public class _03_Avg {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of elements ");
        int n=in.nextInt();
        int sum=0;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            int num=in.nextInt();
            sum=sum+num;
        }
        System.out.println("The average of elements "+sum);
        in.close();
    }
}
