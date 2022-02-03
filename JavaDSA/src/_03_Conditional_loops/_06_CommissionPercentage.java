package _03_Conditional_loops;

import java.util.Scanner;

public class _06_CommissionPercentage {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter the number of sales : ");
        int sales =in.nextInt();
        System.out.println("Enter the commission percentage : ");
        int comm=in.nextInt();
        System.out.println("Enter the number of the commission rates : ");
        int rates=in.nextInt();
        System.out.println("Enter the commission rates : ");
        int[] ratesArray=new int[rates];

        for (int i=0;i<rates;i++)
        {
            ratesArray[i]=in.nextInt();
        }
        // Calculate commission
        int commission = 0;
        for(int i = 0; i < rates; i++){
            if(sales >= ratesArray[i]){
                commission += (sales * comm / 100);
            }
        }
        System.out.println("The commission is: " + commission);
        in.close();
    }
}
