package Practice2.Day14;

public class ContainsDuplicateII219 {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    if (Math.abs(i - j) <= k)
                        return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int k = 3;
        int[] arr = { 1, 2, 3, 1 };
        // int k = 2;
        // int[] arr = { 1, 2, 3, 1, 2, 3 };
        // int k = 1;
        // int[] arr = { 1, 0, 1, 1 };
        boolean bl = containsNearbyDuplicate(arr, k);
        System.out.println(bl);
    }
}
/**
 * Given an integer array nums and an integer k, return true if there are two
 * distinct indices i and j in the array such that nums[i] == nums[j] and abs(i
 * - j) <= k.
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,3,1], k = 3
 * Output: true
 * Example 2:
 * 
 * Input: nums = [1,0,1,1], k = 1
 * Output: true
 * Example 3:
 * 
 * Input: nums = [1,2,3,1,2,3], k = 2
 * Output: false
 */