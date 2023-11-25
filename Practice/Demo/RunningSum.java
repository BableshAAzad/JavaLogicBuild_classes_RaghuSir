package Practice.Demo;

import java.util.Arrays;

public class RunningSum {
    public static int[] runningSum(int[] nums) {
        int[] arr = new int[nums.length];
        int n=0;
        for (int i = 0; i < nums.length; i++) {
            n = n+ nums[i];
            arr[i] = n;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] ar = { 1, 1, 1, 1, 1 };
        int [] result = runningSum(ar);
        System.out.println(Arrays.toString(result));
    }
}
