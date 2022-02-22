package _05_Arrays;

public class _02_getConcatenation
{
   static public int[] getConcatenation(int[] nums)
    {
        int[] result = new int[2*nums.length];
        for(int i =0; i< nums.length ; i++){
            result[i] = nums[i];
            result[nums.length+i] = nums[i];
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
