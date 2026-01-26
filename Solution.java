import java.util.*;

public class Solution {

    
    
    /*public static void main(String[] args) {
        System.out.println("*****\n   *\n  *\n *\n*****");
    }*/



        //is prime number??
    /*public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no.:");
        int n=sc.nextInt();
        int t=0;
        for (int i=2;i<n/2+1;i++){
            if(n%i==0){
                t++;
                break;
            }
        }
        if(t==0 || n=2){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        sc.close();
    }*/



    //print all prime no. till n

    public static void main(String[] args) {
        System.out.print("enter n:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=1;i<=n;i++){
            int cnt=0;
            for(int j=2;j*j<=n;j++){
                if(i%j==0){
                    cnt++;
                    break;
                }
            }

            if (cnt==0 || i==2){
                System.out.println(i);
            }
            
        }
        sc.close();
    }












}

