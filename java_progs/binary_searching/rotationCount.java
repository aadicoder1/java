package java_progs.binary_searching;

public class rotationCount {
    public static void main(String[] args) {
        int[] nums={2,1};
        System.out.println(countRotation(nums));
    }

    public static int findPivot(int[] nums) {
        
        int str=0;
        int end=nums.length-1;
        while (str<=end) {
            int mid=str+(end-str)/2;
            if(mid < end && nums[mid] > nums[mid+1]){
                return mid;
            }
            else if(mid > str && nums[mid] < nums[mid-1]){
                return mid-1;
            }
            else if(nums[mid]<=nums[str]){
                end=mid-1;
            } else {
                str=mid+1;
            }
        }
        return -1;
    }

    public static int countRotation(int[] nums) {
        int pivot=findPivot(nums);
        return pivot+1;
    }
}
