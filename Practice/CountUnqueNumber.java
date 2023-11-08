package Practice;

import java.util.Arrays;

public class CountUnqueNumber {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        boolean[] bl = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (bl[i] == false) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] == nums[j]) {
                        bl[j] = true;
                    }
                }
            }
        }
        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            // for (int j = i+1; j < bl.length; j++) {
            if (bl[i] == false) {
                nums[x] = nums[i];
                x++;
                // }
            }
        }
        System.out.println(Arrays.toString(bl));
        return count;
    }

    public static void main(String[] args) {
        int[] ar = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int i = removeDuplicates(ar);
        System.out.println(i);
    }
}
