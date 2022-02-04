package _03_Conditional_loops;

import java.util.Scanner;

public class _11_Compound_Interest {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter The principle amount ");
        double p=in.nextInt();

        System.out.println("Enter rate ");
        double r=in.nextInt();

        System.out.println("Enter Time ");
        double t=in.nextInt();

        double CI=p * (Math.pow((1+r/100),t));

        System.out.println("Principal = "+p+"\nRate = "+r+"\nCompund Interest = "+CI);
    }
}
