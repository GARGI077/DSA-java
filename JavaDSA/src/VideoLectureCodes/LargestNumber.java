package VideoLectureCodes;

import java.util.Scanner;

public class LargestNumber  {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter three numbers");

        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();

        int max=Math.max(c,Math.max(a,b));
        System.out.println("Maximum Number "+max);
    }
}
