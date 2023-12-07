package Practice.EasyLevel;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbersinaMatrix1380 {
    public static List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> al = new ArrayList<>();
        int x = 0;
        for (int i = 1; i < matrix.length; i++) {
            int tempMin = matrix[x++][0];
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] < tempMin)
                    tempMin = matrix[i][j];
            }
            int tempMax = matrix[i][0];
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] > tempMax)
                    tempMax = matrix[j][i];
            }
            if (tempMax == tempMin)
                al.add(tempMax);
        }
        return al;
    }

    public static void main(String[] args) {
        int[][] matrix = { { 3, 7, 8 }, { 9, 11, 13 }, { 15, 16, 17 } };
        List<Integer> res = luckyNumbers(matrix);
        System.out.println(res);
    }
}
/**
 * Given an m x n matrix of distinct numbers, return all lucky numbers in the
 * matrix in any order.
 * 
 * A lucky number is an element of the matrix such that it is the minimum
 * element in its row and maximum in its column.
 * 
 * Example 1:
 * 
 * Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
 * Output: [15]
 * Explanation: 15 is the only lucky number since it is the minimum in its row
 * and the maximum in its column.
 * Example 2:
 * 
 * Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
 * Output: [12]
 * Explanation: 12 is the only lucky number since it is the minimum in its row
 * and the maximum in its column.
 * Example 3:
 * 
 * Input: matrix = [[7,8],[1,2]]
 * Output: [7]
 * Explanation: 7 is the only lucky number since it is the minimum in its row
 * and the maximum in its column.
 */