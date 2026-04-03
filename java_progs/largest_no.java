package java_progs;
import java.util.*;


public class largest_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        //approach1
        /*if(a>b && a>c){
            System.out.println(a+" is largest");
        }
        else if(b>a && b>c){
            System.out.println(b+" is largest");
        }
        else {
            System.out.println(c+" is largest");
        }*/


        //approach2
        int max=0;
        if(a>b){
            max=a;
        } else {
            max=b;
        }
        if(c>max){
            max=c;
        }
        System.out.println(max+" is largest");

        sc.close();
    }
}
