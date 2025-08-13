//find-first-and-last-position-of-element-in-sorted-array/
package Leetcode_problems.submitted;

public class problem34 {
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1 , -1};
        
        int start=search(nums,target,true);
        int end=search(nums,target,false);
        ans[0]=start;
        ans[1]=end;

        return ans;
    }

    public static int search(int[] nums,int target,boolean findFirstIndex){
        int ans=-1;
        int str=0;
        int end=nums.length-1;

        while(str<end){
            int mid=str + (end-str)/2;
            if(target<nums[mid]){
                end=mid-1;
            } else if (target>nums[mid]){
                str=mid+1;
            } else{
                ans = mid;
                if(findFirstIndex==true){
                    end=mid-1;
                }else{
                    str=mid+1;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        int[] s=searchRange(nums,target);
        System.out.println(s);
    }
}
