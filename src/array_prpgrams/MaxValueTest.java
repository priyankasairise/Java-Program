package array_prpgrams;
import java.util.Scanner;
public class MaxValueTest {
    public static void main(String[] args){
        int[] nums= new int[5];
                System.out.println("Enter array values:");
        for(int i=0;i<nums.length;i++)
        {
           // System.out.println(nums[i]);
            nums[i]= new Scanner(System.in).nextInt();
        }
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(max<nums[i])
            {
                max=nums[i];
            }
        }
        System.out.println("Max value from above array is:" +max);
    }
}
