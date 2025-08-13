//search-a-2d-matrix/

package Leetcode_problems.submitted;
import java.util.*;

public class problem240{
    public static void main(String[] args) {

        int[][] arr={{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 20;
        //System.out.println(Arrays.toString(search(arr, target)));
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