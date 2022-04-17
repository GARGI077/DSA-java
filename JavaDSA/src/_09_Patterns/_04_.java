package _09_Patterns;

import java.util.Scanner;

public class _04_ {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        int n=in.nextInt();

        for (int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j+"\t");
            }
            System.out.println();
        }
    }
}
