package array_prpgrams;
import java.util.Scanner;
public class ArrayTest4 {
    public static void main(String[] args){
        int[] nums = new int[5];
        System.out.println("Enter array values:");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]= new Scanner(System.in).nextInt();
        }
        System.out.println("Even number from my Array list is:");
        for(int i=0; i<nums.length;i++)
        if(nums[i] % 2==0)
        {
            System.out.println(nums[i]);
        }

    }
}
