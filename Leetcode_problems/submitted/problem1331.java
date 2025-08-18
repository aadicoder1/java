//rank-transform-of-an-array/
package Leetcode_problems.submitted;

import java.util.Arrays;

public class problem1331 {
    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 20, 30};
        System.out.println(Arrays.toString(arrayRankTransform(arr)));
    }

public static int[] arrayRankTransform(int[] arr) {
        if (arr.length == 0) return new int[0];

        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        int[] ranks = new int[sorted.length];
        int rank = 1;
        ranks[0] = rank;
        for (int i = 1; i < sorted.length; i++) {
            if (sorted[i] != sorted[i - 1]) {
                rank++;
            }
            ranks[i] = rank;
        }

        for (int i = 0; i < arr.length; i++) {
            int idx = Arrays.binarySearch(sorted, arr[i]);
            arr[i] = ranks[idx];
        }
        return arr;
    }
}