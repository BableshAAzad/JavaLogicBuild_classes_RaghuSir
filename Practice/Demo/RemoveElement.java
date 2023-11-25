package Practice.Demo;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int[] arr = new int[nums.length];
        int x=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val){
                arr[x] = nums[i];
                x++;
            }
            nums[i] =0;
        }
        int j = 0, k = 0;
        for (int i = 0; i < x; i++) {
            if (arr[i] != 0) {
                nums[k] = arr[i];
                k++;
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
        return x;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 }; // [0,1,4,0,3]
        int n = 2;
        int ele = removeElement(arr, n);
        System.out.println(ele);
    }
}
