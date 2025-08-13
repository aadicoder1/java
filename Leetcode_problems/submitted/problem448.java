//find-all-numbers-disappeared-in-an-array/
package Leetcode_problems.submitted;

import java.util.*;

public class problem448 {
    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> missing=cyclicsort(arr);
        System.out.println(missing);
    }
    public static List<Integer> cyclicsort(int[] arr) {
        int i=0;
        while(i<arr.length){
            int correct=arr[i]-1;
            if(arr[i] > 0 && arr[i] <= arr.length && arr[correct] != arr[i]){
                int temp=arr[correct];
                arr[correct]=arr[i];
                arr[i]=temp;
            } else{
                i++;
            }
        }

        ArrayList<Integer> num = new ArrayList<>();
        for (int j=0; j<arr.length ; j++){
            if(arr[j]!=j+1){
                num.add(j+1);
            }
        }
        return num;
    } 
}
