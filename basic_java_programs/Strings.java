package basic_java_programs;
import java.util.*;



/*
public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String name= sc.nextLine();
        System.out.println("Your name is : "+name);

        sc.close();
    }
}
 */


//String functions

public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String firstname= sc.nextLine();
        String secondname= sc.nextLine();
        //concatenation
        String fullname=firstname+" "+secondname;
        System.out.println("Your name is : "+fullname);
        //string length
        System.out.println(fullname.length());
        // charAt
        for(int i=0;i<fullname.length();i++){
            System.out.println(fullname.charAt(i));
        }

        sc.close();
    }
}
 