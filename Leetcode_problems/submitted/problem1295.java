//find-numbers-with-even-number-of-digits

package Leetcode_problems.submitted;

public class problem1295 {
    public static int findNumbers(int[] nums) {
        int cnt=0;
        for(int i=0;i<nums.length;i++){
            int nod=0;
            int elem=nums[i];
            while(elem>0){
                elem=elem/10;
                nod++;
            }
            if(nod%2==0){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] nums={12,345,2,6,7896};
        System.out.println(findNumbers(nums));
    }
}
