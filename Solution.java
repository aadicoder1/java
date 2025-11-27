import java.util.*;
/*
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
}*/



/*
 class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" * " );
            }
            System.out.println("  " );
        }
        sc.close();
    }
}
 */


/*class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
        sc.close();
    }
    public static void pattern(int n){
        for(int i=n;i>=0;i--){
            for(int j=i;j<n;j++){
                System.out.print(" * " );
            }
            System.out.println("  " );
        }

    }
}*/



/*class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
        sc.close();
    }
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j-1>=n){
                System.out.print("*  ");}
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        } 
    }
}  */ 



/*
class Solution{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pattern(n);
        sc.close();
    }
    public static void pattern(int n){
        char ch='a';
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j-1>=n){
                    System.out.print(ch+"  ");
                    ch++;
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        } 
    }
}*/





class Solution {
    public int[] intersection(int[] nums1,int[] nums2){
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> result=new HashSet<>();

        for(int n:nums1){
            set1.add(n);
        }
        for(int n:nums2){
            if(set1.contains(n)){
                result.add(n);
            }
        }
        int[] ans = new int[result.size()];
        int i = 0;
        for (int x:result){
            ans[i++] = x;
        }
        return ans;
    }
}
