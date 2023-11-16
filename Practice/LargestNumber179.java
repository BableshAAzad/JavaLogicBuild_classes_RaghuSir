package Practice;

import java.util.Arrays;

public class LargestNumber179 {
    public static String largestNumber(int[] nums) {
        String s = "";
        for (int i = 0; i < nums.length; i++) {
            s = s + nums[i];
        }
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        System.out.println(Arrays.toString(ch));
        return null;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 30, 34, 5, 9 }; // "9534330"
        String res = largestNumber(arr);
        System.out.println(res);
    }
}
/*
 * Example 1:
 * Input: nums = [10,2]
 * Output: "210"
 * 
 * Example 2:
 * Input: nums = [3,30,34,5,9]
 * Output: "9534330"
 */
