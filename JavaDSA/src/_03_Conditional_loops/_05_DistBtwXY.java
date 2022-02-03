package _03_Conditional_loops;

import java.util.Scanner;

public class _05_DistBtwXY {

    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        System.out.println("Input coordinates of point A ");
        double x_a= in.nextInt();
        double y_a= in.nextInt();
        System.out.println("Input coordinates of point B ");
        double x_b=in.nextInt();
        double y_b=in.nextInt();

        double Xx=Math.pow((x_a-x_b),2);
        double Yy=Math.pow((y_a-y_b),2);
        double Xz=Xx+Yy;
        double dist=Math.sqrt(Xz);

        System.out.println("Distance " + dist);
        in.close();
    }
}
