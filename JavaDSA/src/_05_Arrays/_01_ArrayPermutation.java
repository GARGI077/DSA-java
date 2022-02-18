package _05_Arrays;

import java.util.Scanner;

public class _01_ArrayPermutation {

    public static int[] buildArray(int[] nums) {

        int size=nums.length;

        int[] result=new int[size];
        int i;

        for(i=0;i<nums.length;i++)
        {
            int var=nums[i];
            result[i]=+nums[var];
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);

        System.out.println("Enter size of array ");
        int size=in.nextInt();
        int[] arr=new int[size];


        System.out.println("Enter array elements ");
        int i;
        for(i=0;i<arr.length;i++)
        {
            arr[i]=in.nextInt();
        }

        int[] permutationArray=buildArray(arr);
        for (i=0;i<arr.length;i++)
        {
            System.out.print(permutationArray[i]+" ");
        }
    }

}
