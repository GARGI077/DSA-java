package _03_Conditional_loops;

import java.util.Scanner;

public class _17_Reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = in.nextLine();
        System.out.println("Reverse of a string "+str+" is: ");
        int i = str.length();
        while(i>0){
            System.out.print(str.charAt(i-1));
            i--;
        }
in.close();
    }
}
