package Practice.Medium;

import java.util.Arrays;

public class LongestConsecutiveSequence128 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        int count = 1, temp = 1;
        for (int i = 1; i < nums.length; i++) {
            if (i < nums.length && nums[i] == nums[i - 1] + 1) {
                count++;
            } else if (i < nums.length && nums[i] == nums[i - 1])
                continue;
            else  {
                temp = Math.max(temp, count);
                count = 1;
            }
        }
        return Math.max(temp, count);
    }

    public static void main(String[] args) {
        // int[] nums = { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 }; // 9
        // int[] nums = { 100, 4, 200, 1, 3, 2 }; // 4
        // int[] nums = { 0, -1 }; // 2
        int[] nums = { 9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6 }; // 7
        int res = longestConsecutive(nums);
        System.out.println(res);
    }
}
/**
 * Given an unsorted array of integers nums, return the length of the longest
 * consecutive elements sequence.
 * 
 * You must write an algorithm that runs in O(n) time.
 * 
 * Example 1:
 * 
 * Input: nums = [100,4,200,1,3,2]
 * Output: 4
 * Explanation: The longest consecutive elements sequence is [1, 2, 3, 4].
 * Therefore its length is 4.
 * Example 2:
 * 
 * Input: nums = [0,3,7,2,5,8,4,6,0,1]
 * Output: 9
 * 
 */