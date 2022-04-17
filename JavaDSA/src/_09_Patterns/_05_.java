/*

 *
 *	*
 *	*	*
 *	*
 *

 * */

package _09_Patterns;

import java.util.Scanner;

public class _05_ {

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        int nrow=n;
        int row=1;
        int nstars=1;

        while(row<=nrow)
        {
            for(int i=1;i<=nstars;i++)
            {
                System.out.print("*\t");
            }
            System.out.println();

            if(row<=n/2)
            {
                nstars++;
            }
            else {
                nstars --;
            }

            row++;
        }
    }
}
