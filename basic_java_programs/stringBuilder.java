package basic_java_programs;
//import java.util.*;

//import java.lang.foreign.SymbolLookup;

/*public class stringBuilder {
    //declaration
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Apna College");
        System.out.println(sb);
    
    //Get A Character from Index: charAt
        System.out.println(sb.charAt(3));

    //Set a Character at Index
        sb.setCharAt(0, 'P');
        System.out.println(sb);
    }
}*/


/*public class stringBuilder {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("tony");
        //Insert char
        sb.insert(0, 'S');
        System.out.println(sb);

        //delete char
        sb.delete(1, 2);
        System.out.println(sb);

        //Append a char 
        sb.append(" Stark");
        System.out.println(sb); 

        //Print Length of String
        System.out.println(sb.length());
    }
}*/


//Reverse a String (using StringBuilder class)
public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("HelloWorld");

        for(int i=0;i<sb.length()/2;i++){
            int front=i;
            int back=sb.length()-i-1;

            char frontChar=sb.charAt(front);
            char backChar= sb.charAt(back);

            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);
        }
        System.out.println(sb);
    }
}

  