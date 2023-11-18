package Practice.Medium;

import java.util.PriorityQueue;

public class KthLargestElementinanArray215 {
    public static int findKthLargest(int[] nums, int k) {
        for (int i = 0; i < nums.length; i++) {
            int x = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] > nums[i])
                    x++;
            }
            if (x == k - 1)
                return nums[i];
        }
        return 0;

        // PriorityQueue<Integer> p = new PriorityQueue<>();
        // for (int x : nums) {
        //     p.offer(x);
        //     if (p.size() > k) {
        //         p.poll();
        //     }
        // }
        // return p.peek();
    }

    public static void main(String[] args) {
        int k = 4;
        int[] ar = { 3,2,3,1,2,4,5,5,6}; //4
        // int k = 2;
        // int[] ar = { -1, -1 };
        int res = findKthLargest(ar, k);
        System.out.println(res);
    }
}
/*
 * Given an integer array nums and an integer k, return the kth largest element
 * in the array.
 * 
 * Note that it is the kth largest element in the sorted order, not the kth
 * distinct element.
 * 
 * Can you solve it without sorting?
 * 
 * Example 1:
 * 
 * Input: nums = [3,2,1,5,6,4], k = 2
 * Output: 5
 * Example 2:
 * 
 * Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
 * Output: 4
 */