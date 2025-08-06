//split-array-largest-sum/

/* not solved
 * 
 * Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

A subarray is a contiguous part of the array.

 

Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.
Example 2:

Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.
 

Constraints:

1 <= nums.length <= 1000
0 <= nums[i] <= 106
1 <= k <= min(50, nums.length)
 */

package Leetcode_problems;

public class problem410 {
    public static int splitArray(int[] nums, int k) {
        
        int str=0;
        int end=0;
         
        for(int i=0;i<nums.length;i++){
            str=Math.max(str, nums[i]);
            end += nums[i];
        }

        while(str<end) {
            int mid=str + (end-str)/2;

            int sum=0;
            int split=1;

            for(int n:nums){
                if(sum+n > mid){
                     sum = n;
                     split ++;
                } else {
                    sum += n;
                }
            }

            if (split>k){
                str= mid +1;
            }else {
                end = mid;
            }

        }

        
        
        return end;
    }
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        int k = 2;
        System.out.println(splitArray(nums,k));
    }
}
