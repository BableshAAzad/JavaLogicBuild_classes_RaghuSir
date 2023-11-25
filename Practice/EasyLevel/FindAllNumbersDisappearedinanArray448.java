package Practice.EasyLevel;

import java.util.*;

public class FindAllNumbersDisappearedinanArray448 {
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> hs = new HashSet<Integer>();
        for (int i : nums) {
            hs.add(i);
        }
        List<Integer> al = new ArrayList<Integer>();
        for (int i = 1; i <= nums.length; i++) {
            if (!hs.contains(i)) {
                al.add(i);
            }
        }
        return al;
    }

    public static void main(String[] args) {
        // int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 }; // [5,6]
        int[] nums = { 1, 1 }; // [2]

        List<Integer> al = findDisappearedNumbers(nums);
        System.out.println(al);
    }
}
/**
 * Given an array nums of n integers where nums[i] is in the range [1, n],
 * return an array of all the integers in the range [1, n] that do not appear in
 * nums.
 * 
 * Example 1:
 * 
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * Example 2:
 * 
 * Input: nums = [1,1]
 * Output: [2]
 */