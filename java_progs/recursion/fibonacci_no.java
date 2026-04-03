package java_progs.recursion;

public class fibonacci_no {
    public static void main(String[] args) {
        int fibno=3;
        System.out.println(fib(fibno));
    }   
    public static int fib(int fibno) {
        if(fibno<2){
            return fibno;
        } else {
            return fib(fibno-1)+fib(fibno-2);
        }
    }                                                                                                                    
}
