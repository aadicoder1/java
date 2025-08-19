//find-words-containing-character/
package Leetcode_problems.submitted;

import java.util.ArrayList;
import java.util.List;

public class problem2942 {
    public static void main(String[] args) {
        String[] words = {"abc","bcd","aaaa","cbc"};
        char x = 'a';
        System.out.println(findWordsContaining(words,x));
    }
    public static List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ind= new ArrayList<Integer>() ;
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                if(words[i].charAt(j)==x){
                    ind.add(i);
                    break;
                }
            }
        }
        return ind ;
    }
}
