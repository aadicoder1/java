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
/*
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
}*/ 

/*public class Strings {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        String name1= sc.nextLine();
        String name2= sc.nextLine();
        //compareTo
        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal ");}
        else{
            System.out.println("Strings are not equal ");
        }

        //substring
        String name= "Aaditya";
        System.out.println(name.substring(0, 4));


        sc.close();
    }
}*/

//ParseInt Method of Integer class
/*public class Strings {
   public static void main(String args[]) {
       String str = "123";
       int number = Integer.parseInt(str);
       System.out.println(number);
   }
}*/

//ToString Method of String class
/*public class Strings {
   public static void main(String args[]) {
      int number = 123;
      String str = Integer.toString(number);
      System.out.println(str.length());      
   }
}*/


// Java Strings are Immutable.


//Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’. 
//Example : original = “eabcdef’ ; result = “iabcdif”

public class Strings {
   public static void main(String args[]) {
    Scanner sc = new Scanner (System.in);
    String str = sc.next();
    String result = "";


    for(int i=0; i<str.length(); i++) {
        if(str.charAt(i) == 'e') {
            result += 'i';
        } else {
            result += str.charAt(i);
        }
        }
        System.out.println(result);
        sc.close();
    }
}
