package Practice.Demo;

import java.util.Arrays;

public class SuffulArray {
    /*
     * Input: nums = [2,5,1,3,4,7], n = 3
     * Output: [2,3,5,4,1,7]
     */
    public static int[] shuffle(int[] nums, int n) {
        int[] a = new int[n];
        int[] b = new int[n];
        int aa = 0, bb = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i < n) {
                a[aa++] = nums[i];
            } else if (i >= n) {
                b[bb++] = nums[i];
            }
        }
        int[] temp = new int[nums.length];
        int aaa = 0, bbb = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                temp[i] = a[aaa];
                aaa++;
            } else {
                temp[i] = b[bbb];
                bbb++;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        int n = 3;
        int[] result = shuffle(nums, n);
        System.out.println(Arrays.toString(result));
        // try {
        //     System.out.println(8/2);
        // } catch (Exception e) {
        //     // TODO: handle exception
        // }
    }
}
