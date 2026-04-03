package basic_java_programs;
//import java.util.*;



//Taking an array as an input and printing its elements.
/*
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
 */


//Find the maximum & minimum number in an array of integers.
/*
public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size- ");
        int size= sc.nextInt();
        int arr[] = new int[size];
        int max=arr[0];
        int min=arr[0];

        for(int i=0;i<size;i++){
            System.out.print("Enter arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array is ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0;i<size;i++){
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Maximum no.="+max+" and Minimum no.="+min);
        sc.close();
    }
}
 */


//Take an array of numbers as input and check if it is an array sorted in ascending order.
/*public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size- ");
        int size= sc.nextInt();
        int arr[] = new int[size];
        int isSorted;

        for(int i=0;i<size;i++){
            System.out.print("Enter arr["+i+"]=");
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array is ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
        isSorted=1;
        for(int i=1;i<size;i++){
            if(arr[i]<arr[i-1]){
                isSorted=0;
                break;
            }
        }
        if(isSorted==1){
        System.out.println("Sorted in ascending order ");}
        else{
            System.out.println(" not Sorted in ascending order");
        }
        sc.close();
    }
}
*/