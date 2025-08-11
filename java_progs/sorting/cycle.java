//if range is from 1 to n , then apply cyclic sort
package java_progs.sorting;

import java.util.Arrays;

public class cycle {
    public static void main(String[] args) {
        int[] arr={3,5,2,1,4};
        cyclicsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] cyclicsort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[correct] != arr[i]){
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            } else{
                i++;
            }
        }
        return arr;
    }
}
