//find-in-mountain-array/
package Leetcode_problems.submitted;

interface MountainArray {
      public int get(int index);
      public int length();
  }

public class problem1095 {

public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        
        int firstTry = orderAgnosticBS(mountainArr, target, 0, peak, true);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnosticBS(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }

    int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr.get(mid) > arr.get(mid + 1)) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    int orderAgnosticBS(MountainArray arr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);

            if (midVal == target) return mid;

            if (isAsc) {
                if (target < midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > midVal) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}



