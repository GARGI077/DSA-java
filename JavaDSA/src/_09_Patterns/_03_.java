package _09_Patterns;

import java.util.Scanner;

public class _03_ {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("*\t");
            }
            System.out.println();
        }

        in.close();
    }
}
