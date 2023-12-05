package Practice.EasyLevel;

public class XOROperationinanArray1486 {
    public static int xorOperation(int n, int start) {
        int[] nums = new int[n];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = start + 2 * i;
        }
        int res = nums[0];
        for (int i = 1; i < nums.length; i++) {
            res ^= nums[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5, start = 0;
        int res = xorOperation(n, start);
        System.out.println(res);
    }
}
/**
 * You are given an integer n and an integer start.
 * 
 * Define an array nums where nums[i] = start + 2 * i (0-indexed) and n ==
 * nums.length.
 * 
 * Return the bitwise XOR of all elements of nums.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: n = 5, start = 0
 * Output: 8
 * Explanation: Array nums is equal to [0, 2, 4, 6, 8] where (0 ^ 2 ^ 4 ^ 6 ^ 8)
 * = 8.
 * Where "^" corresponds to bitwise XOR operator.
 * Example 2:
 * 
 * Input: n = 4, start = 3
 * Output: 8
 * Explanation: Array nums is equal to [3, 5, 7, 9] where (3 ^ 5 ^ 7 ^ 9) = 8.
 */