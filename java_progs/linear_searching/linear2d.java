package java_progs.linear_searching;

import java.util.Scanner;

public class linear2d {
    public class linearsearch {

    public static boolean search(int[][] arr, int r,int c, int item) {
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
            if(arr[i][j]==item){
                return true;
            }            
        }}
        return false;
    }
    public static void main(String[] args) {
        System.out.print("Enter no. of rows and columns:");
        Scanner sc=new Scanner(System.in);
        int r = sc.nextInt();
        int c=sc.nextInt();
        int[][] arr= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print("Enter arr["+ i +"]["+ j +"]");
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.print("Enter item to be searched:");
        int item=sc.nextInt();
        boolean result = search(arr, r , c , item);
        if(result != false) {
            System.out.println("Item found at index: " + result);
        } else {
            System.out.println("Item not found.");
        }

        sc.close();
    }
}
}