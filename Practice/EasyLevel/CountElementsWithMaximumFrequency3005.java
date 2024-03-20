package Practice.EasyLevel;

import java.util.*;

public class CountElementsWithMaximumFrequency3005 {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			Integer temp = map.get(nums[i]);
			if (temp != null)
				map.put(nums[i], ++temp);
			else
				map.put(nums[i], 1);
		}
		ArrayList<Integer> al = new ArrayList<>(map.values());
		Collections.sort(al);
		int res = 0;
		for (int i = al.size() - 1; i >= 0; i--) {
			if (i != 0 && al.get(i) == al.get(i - 1)) {
				res += al.get(i);
			} else if (i != 0 && al.get(i) != al.get(i - 1)) {
				res += al.get(i);
				break;
			} else if (i == 0 ) {
				res += al.get(i);
			} else
				break;
		}
		return res;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 3, 1, 4 }; // ^ 4
        int[] nums1 = { 1, 2, 3, 4, 5 }; // ^ 5
        maxFrequencyElements(nums);
    }
}

/**
 * You are given an array nums consisting of positive integers.
 * 
 * Return the total frequencies of elements in nums such that those elements all
 * have the maximum frequency.
 * 
 * The frequency of an element is the number of occurrences of that element in
 * the array.
 * 
 * 11 -07-1960
 * 
 * Example 1:
 * 
 * Input: nums = [1,2,2,3,1,4]
 * Output: 4
 * Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum
 * frequency in the array.
 * So the number of elements in the array with maximum frequency is 4.
 * Example 2:
 * 
 * Input: nums = [1,2,3,4,5]
 * Output: 5
 * Explanation: All elements of the array have a frequency of 1 which is the
 * maximum.
 * So the number of elements in the array with maximum frequency is 5.
 */