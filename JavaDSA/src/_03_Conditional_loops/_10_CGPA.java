package _03_Conditional_loops;

import java.util.Scanner;

public class _10_CGPA {
    public static void main(String[] args) {

       Scanner in=new Scanner(System.in);

       double marks[]=new double[5];
       int i;
       System.out.println("Enter Marks of 5 subjects ");

       for ( i=0;i<5;i++)
       {
           marks[i]=in.nextInt();
       }

       double grades[]=new double[5];
       double cgpa,sum=0;

       for(i=0;i<5;i++)
       {
           grades[i]=marks[i]/10;
           sum+=grades[i];
       }

       cgpa=sum/5;

        System.out.println("CGPA :: "+cgpa);
        System.out.println("CGPA Percentage = "+String.format("%.2f",cgpa * 9.5 ));

    }
}
