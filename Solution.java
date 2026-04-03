import java.util.Scanner;

public class Solution {

    
    
    /*public static void main(String[] args) {
        System.out.println("*****\n   *\n  *\n *\n*****");
    }*/



        //is prime number??
    /*public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter no.:");
        int n=sc.nextInt();
        int t=0;
        for (int i=2;i<n/2+1;i++){
            if(n%i==0){
                t++;
                break;
            }
        }
        if(t==0 || n=2){
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        sc.close();
    }*/



    //print all prime no. till n

    /*public static void main(String[] args) {
        System.out.print("enter n:");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        for (int i=2;i<=n;i++){
            int cnt=0;
            for(int j=2;j*j<=i;j++){
                if(i%j==0){
                    cnt++;
                    break;
                }
            }

            if (cnt==0){
                System.out.println(i);
            }

        }
        sc.close();
    }*/




    //count digits in a number
    /*public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();

        int cnt=0;
        
        for(int i=n;i>0;i/=10){
            cnt++;
        }
        if(n==0){
            System.err.println("1");
        } else {
            System.err.println(cnt);
        }
        sc.close();
    }*/



    //Reverse a number
    /*public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        int rev=0;
        for(int i=n;i>0;i/=10){
            int m=i%10;
            rev=rev*10+m;
        }
        System.out.println(rev);
        sc.close();
    }*/






//Check palindrome number
/*public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        int og=n;
        int rev=0;
        for(int i=n;i>0;i/=10){
            int m=i%10;
            rev=rev*10+m;
        }
        if(og==rev){
            System.out.println("palindrome");
        }else{
            System.out.println("not palindrome");
        }
        sc.close();
}*/




// Sum of digits
/*public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        int sum=0;
        for(int i=n;i>0;i/=10){
            int m=i%10;
            sum=sum+m;
        }        
        System.out.println(sum);
        sc.close();
}*/


//Armstrong number
/*public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        int og=n;
        int sum=0;
        int pwr=0;
        for(int i=n;i>0;i/=10){
            pwr++;
        }
        for(int i=n;i>0;i/=10){
            int m=i%10;
            sum=sum + (int)Math.pow(m,pwr);
        }
        if(og==sum){
            System.out.println("armstrong no");
        }else{
            System.out.println("not armstrong");
        }
        sc.close();
}*/



/*6️⃣ Prime number check
What it means

A number greater than 1 with exactly two divisors: 1 and itself.

Example

Input: 7 → Prime
Input: 9 → Not Prime

Thinking

Check divisibility from 2 to √n

Constraints

n <= 1 → Not prime

Stop early if divisor found
What it means

A number greater than 1 with exactly two divisors: 1 and itself.

Example

Input: 7 → Prime
Input: 9 → Not Prime

Thinking

Check divisibility from 2 to √n

Constraints

n <= 1 → Not prime

Stop early if divisor found

7️⃣ Print primes till n
What it means

Print all prime numbers from 2 to n.

Example

Input: 10
Output: 2 3 5 7

Thinking

Loop from 2 to n

For each number, apply prime check

Constraints

n < 2 → no output

Brute force is OK for small n

8️⃣ GCD / LCM (Euclid’s Algorithm)
GCD meaning

Greatest number that divides both numbers.

Example

Input: a = 12, b = 18
GCD: 6
LCM: 36

Thinking

GCD(a, b) = GCD(b, a % b)

LCM = (a * b) / GCD

Constraints

One number can be zero

Both zero → undefined*/
/*public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("enter a:");
    int a=sc.nextInt();
    System.out.print("enter b:");
    int b=sc.nextInt();
    int c=a*b;
    while(b!=0){
        int temp=b;
        b=a%b;
        a=temp;
    }
    System.out.println("GCD:"+ a);
    System.out.println("lcm:"+ c/a);

    sc.close();
}
*/




/*
9️⃣ Factors of a number
What it means

Numbers that divide n completely.

Example

Input: 12
Output: 1 2 3 4 6 12

Thinking

Loop from 1 to √n

Print both divisor pairs

Constraints

Order may vary

Avoid duplicates for perfect squares

public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i*i<=n;i++){
        if(n%i==0){
            System.out.println(i);
            System.out.println(n/i);
        }
    }

    sc.close();
}



🔟 Perfect number
What it means

Sum of proper divisors equals the number.

Example

Input: 6
Output: Perfect

Because
1 + 2 + 3 = 6

Constraints

Do not include the number itself

1 is not perfect
    */




/*
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int x=a^b;
    int cnt=0;
    while(x>0||x!=0){
        if(x&1){
            cnt++;
        }
        x=x/2;
    }
    System.out.println("hamming distance:"+ cnt);
    sc.close();
}*/

/*
//Find factorial
public static void main(String args[]){      
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}
public static int fact(int n){
    if (n == 0 || n == 1) {
        return 1;
    } else {
        return n * fact(n - 1);
    }
}*/


/*Calculate the product of two number without using multiplication operator
public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(prod(a, b));
    }
}
public static int prod(int a, int b){
    if(b == 0){
        return 0;
    }
    return a + prod(a, b - 1);
}*/


//sort an array in ascending order using recursion , use a helping function to find minimum element in array.

public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sort(arr, n);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
        sc.close();
    }
}
public static int[] sort(int[] arr, int n){
    if(n==0 ||n==1){
        return arr;
    } 
    for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
    return sort(arr,n-1);

}
}