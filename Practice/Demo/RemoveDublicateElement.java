package Practice.Demo;

import java.util.Arrays;

public class RemoveDublicateElement {
    public static int removeDuplicates(int[] nums) {
        int count = 0;
        boolean[] bl = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (bl[i] == false) {
                for (int k = i + 1; k < nums.length; k++) {
                    if (nums[i] == nums[k]) {
                        bl[k] = true;
                        count++;
                    }
                }
            }
        }
        int j = 0;
        int[] arr = new int[nums.length - count];
        for (int i = 0; i < bl.length; i++) {
            if (bl[i] == false)
                arr[j++] = nums[i];
        }
        for (int i = 0; i < arr.length; i++) {
            nums[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
        return j;
    }

    public static void main(String[] args) {
        int[] ar = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int i = removeDuplicates(ar);
        System.out.println(i);
    }
}
