package Practice.EasyLevel;

import java.util.Arrays;

public class MoveZeroes283 {
    public static void moveZeroes(int[] nums) {
        int count = 0, i = 0;
        Arrays.sort(nums);
        while (true) {
            if (nums.length == count) {
                break;
            }
            if (nums[i] == 0 && nums.length != 1) {
                count++;
                if (nums.length > i)
                    i++;
            } else {
                if (nums.length - 1 == i)
                    break;
                else
                    break;
            }
        }
        int x = 0;
        for (int j = count; j < nums.length; j++) {
            nums[x++] = nums[j];
        }
        for (int j = nums.length - count; j < nums.length; j++) {
            nums[x++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {
        int[] nums = { 0, 1, 0, 3, 12 }; // [1,3,12,0,0]
        // int[] nums = { 0 }; // [0]
        // int[] nums = { 0, 0, 0, 0 }; // [0]
        // int[] nums = { 2, 1 };// [2,1]
        moveZeroes(nums);
    }

}
/**
 * Given an integer array nums, move all 0's to the end of it while maintaining
 * the relative order of the non-zero elements.
 * 
 * Note that you must do this in-place without making a copy of the array.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 * Example 2:
 * 
 * Input: nums = [0]
 * Output: [0]
 * 
 */