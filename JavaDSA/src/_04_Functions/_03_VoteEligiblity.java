package _04_Functions;

import java.util.Scanner;

public class _03_VoteEligiblity {

    static void eligiblity(int age)
    {
        if (age>=18 )
        {
            System.out.println("Eligible to vote");
        }

        else
            System.out.println("Not Eligible to vote ");

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the age of person ");
        int age=in.nextInt();
        eligiblity(age);

        in.close();
    }
}
