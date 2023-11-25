package Practice.Demo;

import java.util.Arrays;

public class LengthLastWord {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m + n];
        int a = 0;
        for (int i = 0; i < nums1.length; i++) {
            if (nums1[i] != 0 && a < arr.length) {
                arr[a++] = nums1[i];
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (nums2[i] != 0 && a < arr.length) {
                arr[a++] = nums2[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<arr.length; i++){
            nums1[i] = arr[i];
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        /*
         * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
         * Output: [1,2,2,3,5,6]
         */
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3, n = 3;
        try {
            merge(nums1, m, nums2, n);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
