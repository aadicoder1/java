package Leetcode_problems.submitted;

public class problem162 {
    public int findPeakElement(int[] arr) {
        int str=0;
        int end=arr.length-1;
        if(end==0){
            return 0;
        }else{
        while(str<end){
            int mid=str+(end-str)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            } else {
                str=mid+1;
            }
        }
        return str;   }
    }
}
