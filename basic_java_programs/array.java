package basic_java_programs;
import java.util.*;


public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size- ");
        int size= sc.nextInt();
        int arr[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("Enter arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter array is ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
