import java.util.*;

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
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter number:");
        int n=sc.nextInt();
        
        sc.close();







/*3️⃣ Check palindrome number
What it means

Number reads the same forward and backward.

Example

Input: 121
Output: Palindrome

Input: 123
Output: Not Palindrome

Thinking

Reverse the number

Compare with original

Constraints

Negative numbers are not palindrome

Single digit → always palindrome

4️⃣ Sum of digits
What it means

Add all digits of the number.

Example

Input: 345
Output: 12

Thinking

Extract digit using % 10

Add to sum

Constraints

Large numbers possible

Negative sign ignored

5️⃣ Armstrong number
What it means

Sum of each digit raised to the power of number of digits equals the number itself.

Example

Input: 153
Output: Armstrong

Because
1³ + 5³ + 3³ = 153

Constraints

Must count digits first

Works for 3-digit and more

Single digit numbers are Armstrong

6️⃣ Prime number check
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

Both zero → undefined

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









    }}

