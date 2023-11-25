package Practice.Medium;

import java.util.ArrayList;
import java.util.List;

public class LargestDivisibleSubset368 {
    public static List<Integer> largestDivisibleSubset(int[] nums) {
        List<Integer> al = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] % nums[i] == 0) {
                    al.add(nums[i]);
                    break;
                }
            }
        }
        return al;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3 };
        // int[] nums = { 1, 2, 4, 8 };

        List<Integer> l = largestDivisibleSubset(nums);
        System.out.println(l);
    }
}
/**
 * Given a set of distinct positive integers nums, return the largest subset
 * answer such that every pair (answer[i], answer[j]) of elements in this subset
 * satisfies:
 * 
 * answer[i] % answer[j] == 0, or
 * answer[j] % answer[i] == 0
 * If there are multiple solutions, return any of them.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3]
 * Output: [1,2]
 * Explanation: [1,3] is also accepted.
 * Example 2:
 * 
 * Input: nums = [1,2,4,8]
 * Output: [1,2,4,8]
 */