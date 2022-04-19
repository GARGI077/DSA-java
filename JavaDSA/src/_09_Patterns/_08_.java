package _09_Patterns;

import java.util.Scanner;

public class _08_ {
    public static void main(String[] args) {

        Scanner in =new Scanner(System.in);

        int n=in.nextInt();

        int row=1;
        int nstars=1;
        int nrow=n;
        int nspaces=n/2;

        while (row<=nrow)
        {
            for(int i=1;i<=nspaces;i++)
            {
                System.out.print("\t");
            }
            for(int i=1;i<=nstars;i++)
            {
                System.out.print("*\t");
            }
            System.out.println();
            nspaces--;
            nstars=nstars+2;

            row++;

        }


    }

}
