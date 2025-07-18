package basic_java_programs;




/*public class test {
    public static void main(String[] args) {
        System.out.println("*");
        System.out.println("**");
        System.out.println("***");
        System.out.println("****");
    }
}
*/


//take 2 variables a and b and print their sum.
/*import java.util.* ;

public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println(sum);

        sc.close();
    }
}
*/


//conditional operators
//if - else

/*import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Minor");
        }
        sc.close();
    }
}

import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("odd");
        }
        sc.close();
    }
}*/

//else if

/*import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Equal");
        }
        else if(a>b){
            System.out.println("a is greater");
        }
        else{
            System.out.println("b is greater");
        }
        sc.close();
    }
}*/


//switch case

/*import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("namaste");
                break;
            case 3:
                System.out.println("bonjour");
                break;
            default:
                System.out.println("invalid");
                break;
        }
       
        sc.close();
    }
}*/


//loops

/*import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int sum = 0;
        int n=sc.nextInt();

        for(i=0;i<=n;i++){
            sum = sum + i;
        }
        System.out.println(sum);
        sc.close();
    }
}*/



// pattern printing

/*import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int l=sc.nextInt();
        int b=sc.nextInt();

        for(i=0;i<l;i++){
            for(j=0;j<b;j++){
                System.out.print("*  ");
            }
            System.out.println(" ");
        }
        sc.close();
    }
}*/


/*import java.util.*;
public class test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n=sc.nextInt();
        int m=sc.nextInt();

        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
                if (i==1 || i==n || j==1 || j==m){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
} */