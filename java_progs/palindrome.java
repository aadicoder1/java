package java_progs;

public class palindrome {
    public static void main(String[] args) {
        String str="aaabbbcbbbaaa";
        System.out.println();
        System.out.println(isPalindrome(str));
    }
    public static boolean isPalindrome( String str){
        for(int i=0 ; i<=str.length()/2 ; i++){
            char start= str.charAt(i);
            char end= str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
