package java_progs.recursion;
import java.util.*;

public class binary_search {
    public static void main(String[] args) {
        int[] nums={3,6,2,1,8};
        Arrays.sort(nums);
        int target=6;
        int s=0 , e=nums.length-1;
        System.out.println(BS(nums,target ,s,e));
    }
    public static int BS(int[] nums ,int target, int s ,int e) {
        if(s > e){
            return -1;
        }
        int m = s + (e - s) / 2; 
        if(nums[m] == target){
            return m;
        }
        if(nums[m] > target){
            return BS(nums, target, s, m - 1);
        } else {
            return BS(nums, target, m + 1, e);
        }
    }
}
