//find-all-duplicates-in-an-array/
package Leetcode_problems.submitted;

import java.util.*;

//for small constraints , use hashset for optimization 
/*public class problem442 {
    public static void main(String[] args) {
        int[] nums={1,2,2,2};
        System.out.println(findDuplicates(nums));
    }
    public static List<Integer> findDuplicates(int[] nums) {
        cyclicsort(nums);
        List<Integer> dups = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if (nums[i] != i+1) {
                if (!dups.contains(nums[i])) {
                    dups.add(nums[i]);}
                } 
        }
        return dups;
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
}*/





public class problem442 {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        System.out.println(findDuplicates(nums));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        List<Integer> dups = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                // swap
                int temp = nums[correct];
                nums[correct] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                dups.add(nums[j]);
            }
        }
        return dups;
    }
}
