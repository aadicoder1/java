import java.util.*;
//import java.io.*;

class Solution{
    public static int power(int n){
        int pow=1;
        for(int i=0;i<n;i++){
            pow=pow*2;
        }
        return pow;
    }
    
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            int sum=0;
            for(int j=0;j<n;j++){
                int p = power(j);
                sum=sum+p;
                System.out.println(a+b*sum);
            }
            System.out.println();
        }
        in.close();
    }
}