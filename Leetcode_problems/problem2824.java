package Leetcode_problems;
import java.util.Arrays;

class problem2824 {
    public static int countPairs(int[] nums, int target) {
        Arrays.sort(nums); // O(n log n)
        int left = 0, right = nums.length - 1;
        int count = 0;

        while (left < right) {
            if (nums[left] + nums[right] < target) {
                count += (right - left); // all pairs with nums[left] and nums[left+1..right]
                left++;
            } else {
                right--;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr={1,2,1,3,1,2};
        int target=3;
        System.out.println();
        System.out.println(countPairs(arr, target));
    }
}

