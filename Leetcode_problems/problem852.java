//peak-index-in-a-mountain-array
package Leetcode_problems;

public class problem852 {
    public int peakIndexInMountainArray(int[] arr) {
        int str=0;
        int end=arr.length-1;
        while(str<=end){
            int mid=str+(end-str)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid-1;
            } else {
                str=mid+1;
            }
        }
        return str;   
    }
    
}
