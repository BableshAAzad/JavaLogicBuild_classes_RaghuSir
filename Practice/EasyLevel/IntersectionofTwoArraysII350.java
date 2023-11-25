package Practice.EasyLevel;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionofTwoArraysII350 {
    public static int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> al = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                i++;
            else if (nums1[i] > nums2[j])
                j++;
            else {
                al.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] output = new int[al.size()];
        int k = 0;
        while (k < al.size()) {
            output[k] = al.get(k);
            k++;
        }
        return output;
    }

    public static void main(String[] args) {
        // int[] nums1 = { 1, 2, 2, 1, 4, 4, 4, 4 };
        // int[] nums2 = { 2, 4 }; // [2, 4]

        // int[] nums1 = { 1, 2, 2, 1 };
        // int[] nums2 = { 2, 2 }; // [2,2]

        // int[] nums1 = { 4, 9, 5 };
        // int[] nums2 = { 9, 4, 9, 8, 4 }; // [4,9]

        int[] nums1 = { 3, 1, 2 };
        int[] nums2 = { 1, 1 }; // [1]
        int[] res = intersection(nums1, nums2);
        System.out.println(Arrays.toString(res));
    }
}
/**
 * Given two integer arrays nums1 and nums2, return an array of their
 * intersection. Each element in the result must appear as many times as it
 * shows in both arrays and you may return the result in any order.
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,2,2,1], nums2 = [2,2]
 * Output: [2,2]
 * Example 2:
 * 
 * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * Output: [4,9]
 * Explanation: [9,4] is also accepted.
 */