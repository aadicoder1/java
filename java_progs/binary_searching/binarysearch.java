package java_progs.binary_searching;
import java.util.*;

public class binarysearch {
    public static void main(String[] args) {
        System.out.print("Enter no. of elements:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter arr["+ i +"]:");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              
            }
        }
    }

        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }

        System.out.print("Enter element to be found:");
        int item=sc.nextInt();
        int result=search(arr,item);

        if(result!= -1){
            System.out.println(item+ " is found at index: "+ result);
        }
        else{
            System.out.println(" Item not found.");
        }
        sc.close();
    }

    static int search(int arr[],int item){
        int str=0;
        int end=arr.length;
        
       while(str<=end){
        int mid=str+(end-str)/2; //(str+end)/2  this exceed range of int in java

        if(item<arr[mid]){
            end=mid-1;
        }
        else if(item>arr[mid]){
            str=mid+1;
        }
        else{
                return mid;
            }
        }

        return -1;
    }
}
