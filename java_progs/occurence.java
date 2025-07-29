package java_progs;
import java.util.*;

public class occurence {
    public static void main(String[] args) {
        System.out.print("Enter numbers:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.print("Enter a no.:");
        int i= sc.nextInt();
        int cnt=0;
        while(n>0){
            int r=n%10;
            if(r==i){
                cnt++;
            }
            n=n/10;
        }
        System.out.println(i+" occured "+cnt+" times");
        sc.close();
    }
}
