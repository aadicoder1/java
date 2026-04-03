package java_progs.sorting;
import java.util.*;

public class bubble {
    public static void main(String[] args) {
        int[] arr={2,3,5,4,1};
        System.out.println(Arrays.toString(bubblesort(arr)));
    }
    public static int[] bubblesort(int[] arr) {
        boolean swap;
        for(int i=0;i<arr.length;i++){
            swap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if( !swap ){
                break;
            }
        }
        return arr;
    }
}
