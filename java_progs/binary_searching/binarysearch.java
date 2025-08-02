package java_progs.binary_searching;
import java.util.*;

public class binarysearch {
    public static void main(String[] args) {
        System.out.print("Enter no. of elements:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter arr["+ i +"]");
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                int temp=arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
            }
        }

        System.out.print("Enter element to be found:");
        int item=sc.nextInt();
        search(arr,item);

        sc.close();
    }

    static int search(int arr[],int item){
        int str=0;
        int end=arr.length;
        int mid=(str+end)/2;

       while(str<=end){
            for(int i=0;i<arr.length;i++){
                if(item==arr[mid]){
                    return i;
                }
            }
        }
        return 1;
    }
}
