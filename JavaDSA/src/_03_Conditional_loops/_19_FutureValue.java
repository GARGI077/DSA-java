package _03_Conditional_loops;

import java.util.Scanner;

public class _19_FutureValue {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        System.out.println("Present Value ");
        double pv=in.nextInt();
        System.out.println("Interest Rate ");
        double i=in.nextInt();
        System.out.println("Time period ");
        double t=in.nextInt();

        double fv=pv*Math.pow((1+i),t);

        System.out.println("Future value = "+fv);

        in.close();
    }
}
