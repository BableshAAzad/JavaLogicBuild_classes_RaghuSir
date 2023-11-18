package Practice.EasyLevel;

import java.util.Arrays;

public class CheckifArrayisGood2748 {
    public static boolean isGood(int[] nums) {
        int[] temp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            temp[i] = nums[i];
        }
        Arrays.sort(temp);
        int x = 1;
        for (int i = 0; i < temp.length - 2; i++) {
            if (x == temp[i])
                x++;
            else
                return false;
        }
        x = x - 1;
        // System.out.println(x);
        if (temp[temp.length - 1] == temp[temp.length - 2] && x == temp.length - 2)
            return true;
        // System.out.println(Arrays.toString(temp));
        return false;
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 3 };
        // int[] arr = { 1, 3, 3, 2 };
        boolean bl = isGood(arr);
        System.out.println(bl);
    }
}

/*
 * Example 1:
 * 
 * Input: nums = [2, 1, 3]
 * Output: false
 * Explanation: Since the maximum element of the array is 3, the only candidate
 * n for which this array could be a permutation of base[n], is n = 3. However,
 * base[3] has four elements but array nums has three. Therefore, it can not be
 * a permutation of base[3] = [1, 2, 3, 3]. So the answer is false.
 * Example 2:
 * 
 * Input: nums = [1, 3, 3, 2]
 * Output: true
 * Explanation: Since the maximum element of the array is 3, the only candidate
 * n for which this array could be a permutation of base[n], is n = 3. It can be
 * seen that nums is a permutation of base[3] = [1, 2, 3, 3] (by swapping the
 * second and fourth elements in nums, we reach base[3]). Therefore, the answer
 * is true.
 * Example 3:
 * 
 * Input: nums = [1, 1]
 * Output: true
 * Explanation: Since the maximum element of the array is 1, the only candidate
 * n for which this array could be a permutation of base[n], is n = 1. It can be
 * seen that nums is a permutation of base[1] = [1, 1]. Therefore, the answer is
 * true.
 * Example 4:
 * 
 * Input: nums = [3, 4, 4, 1, 2, 1]
 * Output: false
 * Explanation: Since the maximum element of the array is 4, the only candidate
 * n for which this array could be a permutation of base[n], is n = 4. However,
 * base[4] has five elements but array nums has six. Therefore, it can not be a
 * permutation of base[4] = [1, 2, 3, 4, 4]. So the answer is false.
 */