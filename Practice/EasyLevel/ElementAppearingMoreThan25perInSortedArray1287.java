package Practice.EasyLevel;

import java.util.*;

public class ElementAppearingMoreThan25perInSortedArray1287 {
    public static int findSpecialInteger(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hm.containsKey(arr[i])) {
                hm.put(arr[i], 1);
            } else {
                int temp = hm.get(arr[i]);
                hm.put(arr[i], ++temp);
            }
        }
        int res = 0, result =0;
        for (int i = 0; i < arr.length; i++) {
            if (hm.get(arr[i]) > res){
                res = hm.get(arr[i]);
                result = arr[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 6, 6, 6, 6, 7, 10 };
        int res = findSpecialInteger(arr);
        System.out.println(res);
    }
}
/**
 * Given an integer array sorted in non-decreasing order, there is exactly one
 * integer in the array that occurs more than 25% of the time, return that
 * integer.
 * F
 * Example 1:
 * 
 * Input: arr = [1,2,2,6,6,6,6,7,10]
 * Output: 6
 * Example 2:
 * 
 * Input: arr = [1,1]
 * Output: 1
 */