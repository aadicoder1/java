//sort-the-people/
package Leetcode_problems;
import java.util.*;


public class problem2418 {
    public static void main(String[] args) {
        String[] names={"Mary","John","Emma"};
        int[] heights={180,165,170};
        System.out.println(Arrays.toString(sortPeople(names,heights)));
    }
    public static String[] sortPeople(String[] names, int[] heights) {

        for(int i=0;i<heights.length;i++){
            for( int j=0;j<heights.length-i-1;j++){
                if(heights[j]<heights[j+1]){
                    int temp=heights[j];
                    heights[j]=heights[j+1];
                    heights[j+1]=temp;

                    String temps = names[j];
                    names[j]=names[j+1];
                    names[j+1]=temps;
                } 

            }
        }

        return names;
    }
}
