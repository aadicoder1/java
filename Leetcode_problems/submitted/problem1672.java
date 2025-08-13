//richest-customer-wealth
package Leetcode_problems.submitted;

public class problem1672 {
    public static int maximumWealth(int[][] accounts) {
        int i=0;
        int max=0;
        int sum=0;
        int m=accounts.length;
        int n=accounts[i].length;
        for(i=0;i<m;i++){
            sum=0;
            for (int j=0;j<n;j++){
                sum=sum+accounts[i][j];
                if(max<sum){
                max=sum;
                }
            }            
        }
        return max;
    }
    public static void main(String[] args) {
        int[][] accounts={{1,5},{7,3},{3,5}};
        maximumWealth(accounts);
    }
}
