package VideoLectureCodes;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the char");
        char ch=in.next().trim().charAt(0);

        if(ch>='a'&& ch<= 'z')
        {
            System.out.println("Lowecase");
        }
        else
            System.out.println("Uppercase");
    }
}
