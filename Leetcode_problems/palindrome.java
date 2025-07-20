package Leetcode_problems;
//import java.util.*;

public class palindrome {
    public boolean main(int x) {
    System.out.println("Input:");
    int a=x;
    int r;
    int p=0;
    //try (Scanner sc = new Scanner(System.in)) {
    //    a = sc.nextInt();
    //}

    if (x < 0) {
        return false;
    }
    while(x>0){
        r=x%10;
        p=p*10+r;
        x=x/10;
    }
    if(a==p){
        return true;
    }
    else {
        return false;}
    }
}
