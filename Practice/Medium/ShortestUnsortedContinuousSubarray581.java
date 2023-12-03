package Practice.Medium;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray581 {
    public static int findUnsortedSubarray(int[] nums) {
        int[] arr = nums.clone();
        Arrays.sort(arr);
        int start = arr.length, end = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != nums[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        // System.out.println("Start " + start);
        // System.out.println("end " + end);
        if (end - start >= 0) {
            return end - start + 1;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 6, 4, 8, 10, 9, 15 }; // 5
        // int[] nums = { 1 }; // 0

        int res = findUnsortedSubarray(nums);
        System.out.println(res);
    }
}
/**
 * Given an integer array nums, you need to find one continuous subarray such
 * that if you only sort this subarray in non-decreasing order, then the whole
 * array will be sorted in non-decreasing order.
 * 
 * Return the shortest such subarray and output its length.
 * 
 * Example 1:
 * 
 * Input: nums = [2,6,4,8,10,9,15]
 * Output: 5
 * Explanation: You need to sort [6, 4, 8, 10, 9] in ascending order to make the
 * whole array sorted in ascending order.
 * Example 2:
 * 
 * Input: nums = [1,2,3,4]
 * Output: 0
 * Example 3:
 * 
 * Input: nums = [1]
 * Output: 0
 * 
 */