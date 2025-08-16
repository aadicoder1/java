//number-of-students-doing-homework-at-a-given-time/
package Leetcode_problems.not_submitted;

public class problem1450 {
    public static void main(String[] args) {
        int[] startTime = {4};
        int[] endTime = {4};
        int queryTime = 4;
        System.out.println();
        System.out.println(busyStudent(startTime, endTime, queryTime));
    }
    public static int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int cnt=0;
        for (int i=0;i<startTime.length;i++){
            if (startTime[i]<=queryTime && endTime[i]>=queryTime) {
                cnt++;
            }
        }
        return cnt;
    }
}
