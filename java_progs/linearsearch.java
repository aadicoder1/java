package java_progs;
import java.util.*;


//for integer
/*public class linearsearch {

    public static int search(int[] arr, int n, int item) {
        for(int i=0;i<n;i++){
            if(arr[i]==item){
                return i;
            }            
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.print("Enter no. of elements:");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter arr["+ i +"]");
            arr[i]=sc.nextInt();
        }

        System.out.print("Enter item to be searched:");
        int item=sc.nextInt();
        int result = search(arr, n, item);
        if(result != -1) {
            System.out.println("Item found at index: " + result);
        } else {
            System.out.println("Item not found.");
        }

        sc.close();
    }
}*/



//for string
public class linearsearch {

    public static boolean search( String name, char item) {
        for(int i=0;i< name.length();i++){
            if(name.charAt(i)==item){
                return true;
            }            
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.print("Enter string:");
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        
        System.out.print("Enter item to be searched:");
        char item = sc.next().charAt(0);
        boolean result = search( name, item);
        if(result != false) {
            System.out.println("Item found . " );
        } else {
            System.out.println("Item not found.");
        }

        sc.close();
    }
}