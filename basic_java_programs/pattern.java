package basic_java_programs;




// pattern printing


/*
*  *  *  *  *   
*  *  *  *  *   
*  *  *  *  *   
*  *  *  *  *
*  *  *  *  *

 
import java.util.*;
public class pattern {

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

/*
 
* * * * * 
*       *
*       *
*       *
* * * * *
 
import java.util.*;
public class pattern {

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
}*/


/*
 
* 
* *
* * *
* * * *
* * * * *
 
import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n=sc.nextInt();

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}*/


/*

* * * * * 
* * * *
* * *
* *
*
 
import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n=sc.nextInt();

        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}*/


/*

            *
      *  *  *
   *  *  *  *
*  *  *  *  *
 

import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n=sc.nextInt();

        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i+j-1>=n){
                System.out.print("*  ");}
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }    
        sc.close();
    }
}*/


/*
 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 
import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n=sc.nextInt();

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }    
        sc.close();
    }
}*/



/*
 
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1
 
import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n=sc.nextInt();

        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}*/



/*
 
1 
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 
import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int cnt=1;
        int n=sc.nextInt();

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(cnt++ +" ");
            }
            System.out.println();
        }    
        sc.close();
    }
}*/



/*
 
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1
 
import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int cnt=1;
        int n=sc.nextInt();

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }    
        sc.close();
    }
}*/


























//advanced pattern



/*n=4

*             * 
* *         * *
* * *     * * *
* * * * * * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *

import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n=sc.nextInt();

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }

            for(j=1;j<=n;j++){
                if(i+j-1>=n){
                System.out.print("* ");}
                else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }   
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(j=1;j<=n;j++){
                if(i+j-1>=n){
                System.out.print("* ");}
                else{
                    System.out.print("    ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}*/



/*n=5

        * * * * * 
      * * * * *
    * * * * *
  * * * * *
* * * * *

import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n=sc.nextInt();

        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(i+j-1>=n){
                System.out.print("* ");}
                else{
                    System.out.print("  ");}
                }
            for(j=n-1;j>=i;j--){
                System.out.print("* ");
            }
        System.out.println();
        }
        sc.close();
    }

}*/




/*n=5

    1 
   2 2 
  3 3 3
 4 4 4 4
5 5 5 5 5 
 
import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n=sc.nextInt();

        for(i=1;i<=n;i++){
            for(j=n-1;j>=i;j--){
                System.out.print(" ");}

            for(j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        } 
        sc.close();
    }
}*/



/*n=5
 
        1 
      2 1 2 
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
 
import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n=sc.nextInt();

        for(i=1;i<=n;i++){

            for(j=n-1;j>=i;j--){
                System.out.print("  ");
            }
            for(j=i;j>=1;j--){
                System.out.print(j+" ");
            }
            for(j=2;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();  
        }
        sc.close();
    }
}*/




/*

      * 
    * * *
  * * * * * 
* * * * * * * 
* * * * * * *
  * * * * *
    * * * 
      *
 
import java.util.*;
public class pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int j;
        int n=sc.nextInt();

        for(i=1;i<=n;i++){
            
            for(j=1;j<=n;j++){
                if(i+j-1>=n){
                System.out.print("* ");}
                else{
                    System.out.print("  ");
                }
            }
            for(j=2;j<=i;j++){
                System.out.print("* ");
            }

            System.out.println();
        }   
        for(i=n;i>=1;i--){
            
            for(j=1;j<=n;j++){
                if(i+j-1>=n){
                System.out.print("* ");}
                else{
                    System.out.print("  ");
                }
            }
            for(j=2;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}*/
