package java_progs;
import java.util.*;

public class arrayreverse {
    public static void main(String[] args) {
        System.out.print("Enter no. of item:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter arr[" + i + "]: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        //by reversing loop
        /*System.out.println("Reversed array is:");
        for(int i=n-1;i>=0;i--){
            System.out.print( arr[i] + " ");
        }*/

        //by swapping start and end  indices
        int start=0;
        int end=n-1;
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
        System.out.println("Reversed array is:");
        for(int i=0;i<n;i++){
            System.out.print( arr[i] + " ");
        }       

        sc.close();
    }

    static void swap(int[]arr, int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

}
