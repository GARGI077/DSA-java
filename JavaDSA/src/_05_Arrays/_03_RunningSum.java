package _05_Arrays;

import java.util.Scanner;

public class _03_RunningSum {

    static     public int[] runningSum(int[] nums) {

        int[] result = new int[nums.length];

        // Initialize first element of result array with first element in nums.
        result[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            // Result at index `i` is sum of result at `i-1` and element at `i`.
            result[i] = result[i - 1] + nums[i];
        }
        return result;

    }

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter length of array");
        int s=in.nextInt();
        int[] a=new int[s];
        System.out.println("enter elements of array ");
        for(int i=0;i<s;i++)
        {
            a[i]=in.nextInt();
        }

        int[] sum=new int[s];
        sum=runningSum(a);
        System.out.println("Sum is ");
        for(int i:sum)
        {
            System.out.print(i+"");
        }
    }
}
