package exception;

import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
        try{
        int[] nums= new int[5];

        nums[0]=101;
        nums[4]=104;
        nums[5]=106;
        System.out.println(Arrays.toString(nums));
    }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        System.out.println("imp code");
    }
}
