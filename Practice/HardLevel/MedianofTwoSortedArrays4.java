package Practice.HardLevel;

import java.util.Arrays;

public class MedianofTwoSortedArrays4 {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int x = 0;
        double rea = 0.0;
        for (int i = 0; i < nums1.length; i++) {
            arr[x++] = nums1[i];
        }
        for (int i = 0; i < nums2.length; i++) {
            arr[x++] = nums2[i];
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        if (arr.length % 2 == 0) {
            rea = (double) (arr[arr.length / 2] + arr[arr.length / 2 - 1]) / 2;
            if (rea < 0.0)
                return 0.0;
        } else {
            if (arr.length == 1)
                return arr[0] + 0.00000;
            rea = arr[arr.length / 2 ];
        }
        return rea + 0.00000;
    }

    public static void main(String[] args) {
        // int[] nums1 = { 1, 2 };
        // int[] nums2 = { 3, 4 }; // 2.5
        // int[] nums1 = { 0, 0, 0, 0, 0 };
        // int[] nums2 = { -1, 0, 0, 0, 0, 0, 1 }; //0
        int[] nums1 = { 3 };
        int[] nums2 = { -2, -1 }; // -1.00000
        double d = findMedianSortedArrays(nums1, nums2);
        System.out.println(d);
    }
}
/**
 * Given two sorted arrays nums1 and nums2 of size m and n respectively, return
 * the median of the two sorted arrays.
 * 
 * The overall run time complexity should be O(log (m+n)).
 * 
 * Example 1:
 * 
 * Input: nums1 = [1,3], nums2 = [2]
 * Output: 2.00000
 * Explanation: merged array = [1,2,3] and median is 2.
 * Example 2:
 * 
 * Input: nums1 = [1,2], nums2 = [3,4]
 * Output: 2.50000
 * Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
 */