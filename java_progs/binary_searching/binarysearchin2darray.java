package java_progs.binary_searching;

import java.util.Arrays;

public class binarysearchin2darray {
    public static void main(String[] args) {

        int[][] arr={{1,3}};
        int target = 3;
        System.out.println(Arrays.toString(search(arr, target)));
        System.out.println(searchMatrix(arr,target));
        
    }
    public static int[] search(int[][] arr, int target ){

        int r=0;
        int c=arr[0].length-1;

        while(r<arr.length && c>=0){
            if(arr[r][c]==target){
                return new int[] {r,c};
            }
            if(target>arr[r][c]){
                r++;
            } else {
                c--;
            }
        }

        return new int[] {-1,-1};
    }

    public static boolean searchMatrix(int[][] arr, int target) {
        int[] result =search(arr, target);
        if (Arrays.equals(result, new int[]{-1, -1})){
            return false;
        } else{
            return true;
        }
    }
}
