package Practice.Demo;

import java.util.Arrays;

public class RemoveDublicateElement1 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0; // If the array is empty, there are no duplicates to remove.
        }
        int uniqueCount = 1; // Initialize with 1 since the first element is always unique.
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[uniqueCount] = nums[i];
                uniqueCount++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return uniqueCount;
    }
    public static void main(String[] args) {
        int[] ar = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int i = removeDuplicates(ar);
        System.out.println(i);
    }
}
