package _04_Functions;

import java.util.Scanner;

public class _08_Grades {

    public static void main(String[] args) {
        int count, i;
        float totalMarks = 0, percentage, average;
        Scanner scanner;
        scanner = new Scanner(System.in);

        System.out.println("Enter Number of Subject");
        count = scanner.nextInt();

        System.out.println("Enter Marks of " + count + " Subject");
        for (i = 0; i < count; i++) {
            totalMarks += scanner.nextInt();
        }
        System.out.println("Total MArks : " + totalMarks);
        // Each subject is of 100 Marks
        percentage = (totalMarks / (count * 100)) * 100;
        int valuate=(int)percentage/10;

        System.out.println("");
    }

    static String Grades(int marks )
    {
       if (marks== 9)
                return ("Grade : A+");

       if(marks==8||marks==7)
           return("Grade : A");
       if(marks==6)
                return("Grade : B");
       if(marks==5)
                return("Grade : C");
                else
                return("Grade : D");

        }


    }

