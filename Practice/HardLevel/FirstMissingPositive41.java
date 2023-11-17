package Practice.HardLevel;

import java.util.Arrays;

public class FirstMissingPositive41 {
    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int temp = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == temp)
                temp++;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, -1, 1 };
        int rex = firstMissingPositive(arr);
        System.out.println(rex);
    }
}

/*
 * Example 1:
 * 
 * Input: nums = [1,2,0]
 * Output: 3
 * Explanation: The numbers in the range [1,2] are all in the array.
 * Example 2:
 * 
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Explanation: 1 is in the array but 2 is missing.
 * Example 3:
 * 
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 * Explanation: The smallest positive integer 1 is missing.
 */