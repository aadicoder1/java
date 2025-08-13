//find-the-duplicate-number/
package Leetcode_problems;
/*
public class problem287 {
    public static void main(String[] args) {
        int[] nums={1,3,4,3,2};
        System.out.println();
        System.out.println(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int i=0;
        while(i<nums.length){
            for(int j=i+1;j<nums.length;j++){  
                if(nums[i]==nums[j]){
                    return nums[i];
                }             
            }
            i++;
        }
        return -1;
    }
}*/


//optimized 


//import java.util.*;

public class problem287 {

public static void main(String[] args) {
        int[] nums={1,3,4,3,2};
        System.out.println(findDuplicate(nums));
    }
public static int findDuplicate(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(arr[i] != i+1){
                int correct=arr[i]-1;
                if(arr[correct] != arr[i]){
                    int temp=arr[correct];
                    arr[correct]=arr[i];
                    arr[i]=temp;
                } else{
                    return arr[i];
                }
            }  else {
                i++;
            }          
        }      
        return -1;
    }
}     