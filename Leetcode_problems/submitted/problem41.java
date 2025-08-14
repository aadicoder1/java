//first-missing-positive/
package Leetcode_problems.submitted;

public class problem41 {
    public static void main(String[] args) {
        int[] nums={1};
        System.out.println(firstMissingPositive(nums));
    }
    public static int firstMissingPositive(int[] nums) {
        cyclicsort(nums);
        for (int i=0;i<nums.length;i++){
            if(nums[i] != i+1){
                return i+1;
            }
        }
        return nums.length+1;
    }
    public static int cyclicsort(int[] nums) {
        int i=0;
        while(i<nums.length){
                int correct=nums[i]-1;
                if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]){
                    int temp=nums[correct];
                    nums[correct]=nums[i];
                    nums[i]=temp;
                } else {
                    i++;
                }            
        }
        return -1;
    }
}
