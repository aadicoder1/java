package java_progs.linear_searching;
import java.util.*;

public class minelement {

    public static void main(String[] args) {
        System.out.print("Enter no. of elements:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter arr["+ i +"]");
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("minimum element is "+ min);

        sc.close();
    }
}
