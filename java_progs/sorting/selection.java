package java_progs.sorting;

import java.util.Arrays; 

public class selection {
    public static void main(String[] args) {
        int[] arr={3,1,5,4,2};
        selectionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionsort(int[] arr) {
        for(int i=0;i<arr.length;i++){
            int last=arr.length-i-1;
            int max=getmax(arr,0,last);
            swap(arr, max , last);
        }
    }
    public static void swap(int[] arr, int first , int last){
        int temp=arr[first];
        arr[first]=arr[last];  
        arr[last]=temp;
    }
    public static int getmax(int[] arr,int start,int last){
        int max=0;
        for(int i=start;i<=last;i++){
            if(arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
