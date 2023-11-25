package Practice.Medium;

import java.util.Arrays;

public class KthSmallestElementinaSortedMatrix378 {
    public static int kthSmallest(int[][] matrix, int k) {
        int[] temp = new int[matrix.length * matrix[0].length];
        int x = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (temp.length > x) {
                    temp[x++] = matrix[i][j];
                }
            }
        }
        Arrays.sort(temp);
        return temp[k-1];
    }

    public static void main(String[] args) {
        int[][] matrix = { { 1, 5, 9 }, { 10, 11, 13 }, { 12, 13, 15 } };
        int k = 8;
        // int[][] matrix = { { 1, 2 }, { 1, 3 } };
        // int k = 2;
        int res = kthSmallest(matrix, k);
        System.out.println(res);
    }
}
/**
 * Given an n x n matrix where each of the rows and columns is sorted in
 * ascending order, return the kth smallest element in the matrix.
 * 
 * Note that it is the kth smallest element in the sorted order, not the kth
 * distinct element.
 * 
 * You must find a solution with a memory complexity better than O(n2).
 * 
 * Example 1:
 * 
 * Input: matrix = [[1,5,9],[10,11,13],[12,13,15]], k = 8
 * Output: 13
 * Explanation: The elements in the matrix are [1,5,9,10,11,12,13,13,15], and
 * the 8th smallest number is 13
 * Example 2:
 * 
 * Input: matrix = [[-5]], k = 1
 * Output: -5
 */