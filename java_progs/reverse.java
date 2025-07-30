package java_progs;
import java.util.*;

public class reverse {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int rev=0;
        while(n>0){
            rev=rev*10+(n%10);
            n=n/10;
        }
        System.out.println("reverse of "+n+" is "+rev);

        sc.close();
    }
}
