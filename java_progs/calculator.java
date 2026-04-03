package java_progs;
import java.util.*;

public class calculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int num1=0;
        int num2=0;
        char op;
        int res = 0;

        while (true) {
            System.out.print("Enter operands:");
            num1=sc.nextInt();
            num2=sc.nextInt();

            System.out.print("Enter operator:");
            op = sc.next().charAt(0);

            if(op!= '+' && op!= '-' && op!= '/' && op!='*' && op!= '%'){
                break;
            }           
            
            if(op=='+'){
                res=num1+num2;
            }
            else if(op=='-'){
                res=num1-num2;
            }
            else if(op=='*'){
                res=num1*num2;
            }
            else if(op== '/'){
                res=num1/num2;
            }
            else if(op=='%'){
                res=num1%num2;
            }
            else{
                System.out.println("Invalid input");
            }

            System.out.println(num1 + " " + op + " " + num2 + " = " + res);

        }

        sc.close();
    }    
}