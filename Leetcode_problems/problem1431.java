package Leetcode_problems;

import java.util.ArrayList;
import java.util.List;

public class problem1431 {
    public static void main(String[] args) {
        int[] candies={2,3,5,1,3};
        int extraCandies=3;
        System.out.println(kidsWithCandies(candies,extraCandies));
    }
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=-1;
        for(int i=0;i<candies.length;i++){
            if(candies[i]>max){
                max=candies[i];
            }
        }

        List<Boolean> bool_arr = new ArrayList<>();
        for(int i=0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                bool_arr.add(true);
            } else {
                bool_arr.add(false);
            }
        }
        return bool_arr;
    }
}
