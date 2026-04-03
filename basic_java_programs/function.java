package basic_java_programs;
//import java.util.*;



/*
public class function {
    public static void printName(String name) {   //function declaration
        System.out.println(name);
        return;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        printName(name);                        //function calling
        sc.close();
    }
}*/
 


//Write a function to add 2 numbers.
/*public class function {

    public static int add(int a,int b) {
        int sum;
        sum=a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("sum of "+ a +" and "+ b +" is "+add(a,b));
        sc.close();
    }
}*/


//Write a function to multiply 2 numbers.
/*public class function {

    public static int mul(int a,int b) {
        int product;
        product=a*b;
        return product;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("product of "+ a +" and "+ b +" is "+mul(a,b));
        sc.close();
    }
}*/


// Write a function to calculate the factorial of a number.
/*public class function {

    public static int fact(int a) {
        int f=1;
        while(a>0){
            f=f*a;
            a--;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();

        System.out.println("factorial of "+ a +" is "+fact(a));
        sc.close();
    }
}*/


//Greatest common divisor
/*public class function {
    public static int hcf(int a,int b) {
        int temp;
        
        while (b!=0) {            
        temp=b;
        b=a%b;
        a=temp;}

        return a ;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

        System.out.println("greatest common divisor of " + a + " and " + b + " is " + hcf(a,b));
        sc.close();
    }
}*/


//Fibonacci series
/*public class function {

    public static int fib(int a) {
        if(a == 0){
            return 0;
        }
        else if(a == 1){
            return 1;
        }
        else{
            return fib(a-1) + fib(a-2);
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int i;

        System.out.println("Fibonacci series till "+ a +" is ");
        for(i=0;i<=a;i++){
            System.out.print(fib(i)+",");
        }
        sc.close();
    }
}*/
