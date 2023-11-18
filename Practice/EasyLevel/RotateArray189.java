package Practice.EasyLevel;

import java.util.Arrays;

public class RotateArray189 {
    public static void rotate(int[] nums, int k) {
        // int[] tmp = new int[nums.length];
        // for (int i = 0; i < nums.length; i++) {
        // tmp[(i + k) % nums.length] = nums[i];
        // }
        // for (int i = 0; i < nums.length; i++) {
        //         nums[i] = tmp[i];
        //     }
        // System.out.println(Arrays.toString(tmp));
        if (nums.length < k) {
            while (k > 0) {
                for (int i = 0; i < nums.length; i++) {
                    int temp = nums[i];
                    nums[i] = nums[nums.length - 1];
                    nums[nums.length - 1] = temp;
                }
                k--;
            }
        } else {
            int[] ar = new int[nums.length];
            int x = 0;
            for (int i = nums.length - k; i < ar.length; i++) {
                ar[x++] = nums[i];
            }
            for (int i = 0; i < ar.length - k; i++) {
                ar[x++] = nums[i];
            }
            for (int i = 0; i < nums.length; i++) {
                nums[i] = ar[i];
            }
            System.out.println(Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        int k = 3;
        int[] ar = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(ar, k);
    }
}
/*
 * Given an integer array nums, rotate the array to the right by k steps, where
 * k is non-negative.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,4,5,6,7], k = 3
 * Output: [5,6,7,1,2,3,4]
 * Explanation:
 * rotate 1 steps to the right: [7,1,2,3,4,5,6]
 * rotate 2 steps to the right: [6,7,1,2,3,4,5]
 * rotate 3 steps to the right: [5,6,7,1,2,3,4]
 * Example 2:
 * 
 * Input: nums = [-1,-100,3,99], k = 2
 * Output: [3,99,-1,-100]
 * Explanation:
 * rotate 1 steps to the right: [99,-1,-100,3]
 * rotate 2 steps to the right: [3,99,-1,-100]
 * 
 */