//set-mismatch/
package Leetcode_problems.not_submitted;

import java.util.*;

public class problem645 {
    public static void main(String[] args) {
        int[] nums={1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
    public static int[] findErrorNums(int[] nums) {
        cyclicsort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                return new int[]{nums[i],i+1};
            }
        }
        return new int[0];
    }
    public static int[] cyclicsort(int[] nums) {
        int i=0;
        while(i<nums.length){
            int correct=nums[i]-1;
            if (nums[correct] != nums[i]){
                int temp=nums[correct];
                nums[correct]=nums[i];
                nums[i]=temp;
            } else {
                i++;
            }
        }
        return nums;
    }
}
