package java_progs.sorting;
import java.util.*;

public class insertion {
    public static void main(String[] args) {
        int[] arr={5,3,4,1,2};
        insertionsort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static int[] insertionsort(int[] arr) {
        for(int i=0;i<arr.length-1;i++){
            for (int j=i+1;j>0;j--){
                if(arr[j-1]<arr[j]){
                    break;
                } else {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
}
