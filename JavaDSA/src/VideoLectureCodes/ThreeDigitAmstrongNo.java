package VideoLectureCodes;

import java.util.Scanner;

public class ThreeDigitAmstrongNo {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.println("Printing all 3 digit amrmstromg no ");
        
        for (int i=100;i<1000;i++)
        {
            if(isArmstrong(i)==true)
                System.out.println(i);
            else
                continue;
        }


    }
    static boolean isArmstrong(int n)
    {
        int o=n;
        int sum =0;
        while(n!=0)
        {
            int rem=n%10;
            n=n/10;
            sum=sum+rem*rem*rem;
        }
    return sum==o;
    }
}
