package _03_Conditional_loops;

import java.util.Scanner;

public class _12_AvgMarks {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        int marks[]=new int[5];
        int sum=0,avg=0,i;
        System.out.println("Enter marks ");
        for(i=0;i<5;i++)
        {
            marks[i]=in.nextInt();
            sum=sum+marks[i];
        }
        avg=sum/5;
        System.out.println("Marks :");
        for (i=0;i<5;i++) {
            System.out.print(marks[i]+" ");
        }

        System.out.println("\nAverage = "+ avg);
    }
}
