package Practice.Medium;

public class MinimumSizeSubarraySum209 {
    public static int minSubArrayLen(int target, int[] nums) {
        int sum = 0, temp = 0;
        for (int i = 0; i < nums.length; i++) {
            
        }
        return 0;
    }

    public static void main(String[] args) {
        // int[] nums = { 2, 3, 1, 2, 4, 3 }; // 2
        // int target = 7;
        int[] nums = { 1, 4, 4 }; // 1
        int target = 4;
        int res = minSubArrayLen(target, nums);
        System.out.println(res);
    }
}
/**
 * Given an array of positive integers nums and a positive integer target,
 * return the minimal length of a
 * subarray
 * whose sum is greater than or equal to target. If there is no such subarray,
 * return 0 instead.
 * 
 * Example 1:
 * 
 * Input: target = 7, nums = [2,3,1,2,4,3]
 * Output: 2
 * Explanation: The subarray [4,3] has the minimal length under the problem
 * constraint.
 * Example 2:
 * 
 * Input: target = 4, nums = [1,4,4]
 * Output: 1
 * Example 3:
 * 
 * Input: target = 11, nums = [1,1,1,1,1,1,1,1]
 * Output: 0
 */