package java_progs;
import java.util.*;

public class fibonacci_no {
    public static void main(String[] args) {
        System.out.print("nth fibonacci series:");

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++){
            a=b;
            b=c;
            c=a+b;
        }
        System.out.println(c);
        sc.close();
    }
}
