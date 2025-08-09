package java_progs.binary_searching;
import java.util.*;

public class binarysearchin_sorted2darray {
    
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        int target=6;
        System.out.println(Arrays.toString(search(arr, target)));
    }

    public static int[] binarySearching(int[][] arr,int rows , int cstr ,int cend ,int target) {
        
        while (cstr<=cend) {
            int mid= cstr + (cend-cstr)/2;
            if (arr[rows][mid] == target) {
                return new int[] {rows,mid};  
            }
            if(target>arr[rows][mid]){
                cstr=mid+1 ;
            } else {
                cend=mid-1;
            }
        }
        
        return new int[] {-1,-1};
    }

    public static int[] search(int[][] arr , int target) {
        
        int rows = arr.length;
        int cols= arr[0].length -1 ;
        //when we have only one row
        if (rows==1){
            return binarySearching(arr ,rows, 0, cols, target);
        }
        //when we have more than 2 rows
        int rstr=0;
        int rend=rows-1;
        int cmid=cols/2;

        while (rstr < (rend -1)) {
            int mid=rstr + (rend-rstr)/2;
            if(arr[mid][cmid]==target){
                return new int[] {mid,cmid};
            } else if (arr[mid][cmid] > target){
                rend=mid;
            } else {
                rstr=mid;
            }
        }

        //when we have exactly 2 rows , now we have to search in col of two rows
        if (arr[rstr][cmid]==target) {
            return new int[]{rstr,cmid};
        } 
        if (arr[rstr + 1][cmid]==target) {
            return new int[]{rstr + 1 ,cmid};
        }
        //first half
        if(arr[rstr][cmid-1] >=target){
            return binarySearching(arr, rstr, 0, cmid-1, target);
        }
        //second half
        if(arr[rstr][cmid+1] <=target){
            return binarySearching(arr, rstr, 0, cmid+1, target);
        }
        //third half
        if(arr[rstr+1][cmid-1] >=target){
            return binarySearching(arr, rstr+1, 0, cmid-1, target); 
        }
        //fourth half
        else{
            return binarySearching(arr, rstr+1, 0, cmid+1, target);
        }
    }

}
