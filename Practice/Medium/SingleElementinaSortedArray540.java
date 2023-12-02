package Practice.Medium;

import java.util.*;

public class SingleElementinaSortedArray540 {
    public static int singleNonDuplicate(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i]))
                hm.put(nums[i], 2);
            else {
                hm.put(nums[i], 1);
            }
        }
        Set<Integer> i = hm.keySet();
        for (Integer integer : i) {
            if (hm.get(integer) == 1)
                return integer;
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        int res = singleNonDuplicate(arr);
        System.out.println(res);
    }
}
/**
 * You are given a sorted array consisting of only integers where every element
 * appears exactly twice, except for one element which appears exactly once.
 * 
 * Return the single element that appears only once.
 * 
 * Your solution must run in O(log n) time and O(1) space.
 * 
 * 
 * 
 * Example 1:
 * 
 * Input: nums = [1,1,2,3,3,4,4,8,8]
 * Output: 2
 * Example 2:
 * 
 * Input: nums = [3,3,7,7,10,11,11]
 * Output: 10
 */