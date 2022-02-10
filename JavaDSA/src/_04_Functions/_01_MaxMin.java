package _04_Functions;

import java.util.Scanner;

public class _01_MaxMin {

    static int max(int a,int b,int c)
    {
        int max = 0;
        if (a >b && a>c)
        {
            max=a;
        }
        else if(b>c)
        {
            max=b;
        }
        else
            max=c;

        return max;
    }


    static int min(int a,int b,int c)
    {
        int min = 0;
        if (a <b && a<c)
        {
            min=a;
        }
        else if(b<c)
        {
            min=b;
        }
        else
            min=c;

        return min;
    }


    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter First Number ");
        int a=in.nextInt();
        System.out.println("Enter Second Number ");
        int b=in.nextInt();
        System.out.println("Enter Third Number ");
        int c=in.nextInt();

        int max=max(a,b,c);
        int min=min(a,b,c);

        System.out.println("First Num : "+a+"\nSecond Num : "+b+"\nThird Num : "+c+"\nMaximum Number : "+max+"\nMinimum Number : "+min);

        in.close();



    }


}
