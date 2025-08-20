package Leetcode_problems.not_submitted;

import java.util.ArrayList;
import java.util.List;

public class problem2089 {
    public static void main(String[] args) {
        int[] nums = {1,2,5,2,3};
        int target = 2;
        System.out.println(targetIndices(nums,target));
    }
    public static int[] sort(int[] nums){
        for(int i=0;i<nums.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(nums[j-1]<nums[j]){
                    break;
                } else {
                    int temp=nums[j];
                    nums[j]=nums[j-1];
                    nums[j-1]=temp;
                }
            }
        }
        return nums;
    }
    public static List<Integer> targetIndices(int[] nums, int target) {
        sort(nums);
        List<Integer> ind = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                ind.add(i);
            }
        }

        return ind;
    }
}
