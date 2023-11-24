package Practice.EasyLevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class IntersectionofTwoArrays349 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        TreeSet<Integer> ts1 = new TreeSet<Integer>();
        for (Integer i : nums1) {
            ts1.add(i);
        }
        TreeSet<Integer> ts2 = new TreeSet<Integer>();
        for (Integer i : nums2) {
            ts2.add(i);
        }
        ArrayList<Integer> al = new ArrayList<Integer>();
        for (Integer i : ts1) {
            if (ts2.contains(i))
                al.add(i);
        }
        int[] arr = new int[al.size()];
        for (int i = 0; i < al.size(); i++)
            arr[i] = al.get(i);
        return arr;
    }

    public static void main(String[] args) {
        // int[] nums1 = { 1, 2, 2, 1 };
        // int[] nums2 = { 2, 2 }; // [2]
        int[] nums1 = { 4, 9, 5 };
        int[] nums2 = { 9, 4, 9, 8, 4 }; // [4,9]
        int[] res = intersection(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
/**
 * Given two integer arrays nums1 and nums2, return an array of their
 * intersection. Each element in the result must be unique and you may return
 * the result in any order.
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2]
 * Example 2:
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [9,4]
 * Explanation: [4,9] is also accepted.
 */