package leetcode;

public class 二分查找 {


    // 二分查找
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = (end -start) / 2+start;
            int num = nums[mid];
            if (num> target) {
                end = mid-1;
            } else  if (num< target) {
                start = mid+1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}
