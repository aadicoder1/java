//missing-number/
package Leetcode_problems.submitted;

public class problem268 {
    public static void main(String[] args) {
        int[] arr={3,0,1};
        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int i=0;
        while(i<arr.length){
            if(arr[i]<arr.length && arr[arr[i]] != arr[i]){
                int temp=arr[arr[i]];
                arr[arr[i]]=arr[i];
                arr[i]=temp;
            } else{
                i++;
            }
        }
        
        for(int j=0; j<arr.length;j++){
            if(arr[j]!=j){
                return j;
            }
        }
        return arr.length;         
    }
}
