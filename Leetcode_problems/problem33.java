//search-in-rotated-sorted-array/
package Leetcode_problems;

public class problem33 {
    public static int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        if(pivot == -1){
            return binarySearch(nums, target ,0,nums.length-1);
        }
        if(pivot>-1 && nums[pivot]==target){
            return pivot;
        }
        else if(target>=nums[0]){
            return binarySearch(nums, target , 0 , pivot-1);
        }
        return binarySearch(nums, target , pivot+1 , nums.length-1);
    }

    public static int findPivot(int[] nums) {
        
        int str=0;
        int end=nums.length-1;
        while (str<=end) {
            int mid=str+(end-str)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(mid > str && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]<=nums[str]){
                end=mid-1;
            } else {
                str=mid+1;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int target ,int str,int end) {
        while (str<=end) {
            int mid=str+(end-str)/2;
            if(target<nums[mid]){
                end=mid-1;
            } else if( target>nums[mid]){
                str=mid+1;
            }
            else {
                return mid;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums={1};
        int target=1;
        System.out.println(search(nums, target));
    }
}
