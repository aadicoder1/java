package basic_java_programs;
import java.util.*;



//Taking a matrix as an input and printing its elements.
/*
public class TwoDArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no of row=");
    int r=sc.nextInt();
    System.out.print("Enter no of column=");
    int c=sc.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print("Enter arr["+i+"]["+j+"]=");
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("Entered array is ");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    sc.close();
    }   
} */


//Searching for an element x in a matrix.
/*
public class TwoDArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter no of row=");
    int r=sc.nextInt();
    System.out.print("Enter no of column=");
    int c=sc.nextInt();
    System.out.print("Enter element to be find=");
    int item=sc.nextInt();
    int arr[][]=new int[r][c];

    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print("Enter arr["+i+"]["+j+"]=");
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println("Entered array is ");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(arr[i][j]+" ");
        }
        System.out.println();
    }
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(item==arr[i][j]){
                System.out.print(item+" is found at ("+i+","+j+")");
            }
        }
    }

    sc.close();
    }   
}
 */ 