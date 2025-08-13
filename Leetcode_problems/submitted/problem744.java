//find-smallest-letter-greater-than-target/
package Leetcode_problems.submitted;

public class problem744 {
    public static char nextGreatestLetter(char[] letters, char target) {
        int n=letters.length;
        for(int i=0;i<n;i++){
            if(target<letters[i]){
                return letters[i];
            }
        }
        return letters[0];
    }
    public static void main(String[] args) {
        char[] letters= {'c','f','j'};
        char target='f';
        System.out.println(nextGreatestLetter(letters,target));
    }

}
