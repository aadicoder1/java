package java_progs.binary_searching;
import java.util.*;

public class Ceiling {
    public static void main(String[] args) {
        System.out.print("Enter no. of elements:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter arr[" + i + "]:");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                }
            }
        }

        System.out.println("Sorted array:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nEnter element to be found:");
        int item = sc.nextInt();
        int result = ceiling(arr, item);

        if (result != -1) {
            System.out.println(" Ceiling: " + result);
        } else {
            System.out.println(" cannot be not found.");
        }
        sc.close();
    }

    static int ceiling(int arr[], int item) {
        int str = 0;
        int end = arr.length - 1;
        int mid =(str+end)/2;

        while (str <= end) {
            mid = str + (end - str) / 2; //(str+end)/2  this exceed range of int in java

            if (item < arr[mid]) {
                end = mid - 1;
            } else if (item > arr[mid]) {
                str = mid + 1;
            } else {
                return arr[mid];
            }
        }
        return arr[mid];
    }
}
