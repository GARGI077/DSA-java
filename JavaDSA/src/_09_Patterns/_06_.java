package _09_Patterns;

import java.util.Scanner;

public class _06_ {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        int nstars=1;


        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("\t");
            }
            for(int j=1;j<=nstars;j++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            nstars++;
        }
    }
}
