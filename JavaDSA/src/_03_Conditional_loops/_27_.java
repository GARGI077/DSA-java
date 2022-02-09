package _03_Conditional_loops;

import java.util.Scanner;

public class _27_ {
    public static void main(String[] args) {
        System.out.println("Enter numbers randomly and 0 to stop");
        int num, negSum = 0, evenSum = 0, oddSum = 0;
        while (true) {
            Scanner input = new Scanner(System.in);
            num = input.nextInt();
            if (num < 0) {
                negSum += num;
            }else {
                if (num % 2 == 0) {
                    evenSum += num;
                }else {
                    oddSum += num;
                }
            }
            if (num == 0) {
                System.out.println("Negative Sum " + negSum + " Even sum " + evenSum + " Odd Sum " + oddSum);
                break;
            }
        }
    }
}
