package Practice;

import java.util.Arrays;

public class AddUnqueElement {
    static int sumOfUniqu(int[] nums) {
        int sum = 0;
        boolean[] bl = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (bl[i] == false) {
                for (int j = i+1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        bl[i] = true;
                        bl[j] = true;
                    }
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (bl[i] == false) {
                sum = sum + nums[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] ar = { 1, 2, 3, 2 };
        int sum = sumOfUniqu(ar);
        System.out.println(sum);

        /*
         * Example 1:
         * 
         * Input: nums = [1,2,3,2]
         * Output: 4
         * Explanation: The unique elements are [1,3], and the sum is 4.
         * Example 2:
         * 
         * Input: nums = [1,1,1,1,1]
         * Output: 0
         * Explanation: There are no unique elements, and the sum is 0.
         * Example 3:
         * 
         * Input: nums = [1,2,3,4,5]
         * Output: 15
         * Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.
         */
    }
}
