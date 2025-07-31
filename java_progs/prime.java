package java_progs;
import java.util.*;

public class prime {

    public static int primen(int n) {
        int cnt=0;
        for(int i=2;i<n;i++){
            if(n%i==0){
                cnt++;
            }
        }
        if(cnt>=1){
            System.out.println(n+" is not a prime number");
        }
        else{
            System.out.println(n+" is prime number");
        }

        return n;
    }
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        primen(n);
        sc.close();
    }
}
