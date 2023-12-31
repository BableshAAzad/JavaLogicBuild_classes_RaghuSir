package Practice.EasyLevel;

public class ReshapetheMatrix566 {
    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] arr = new int[r][c];
        int row = mat.length, col = mat[0].length, ri = 0, ci = 0;
        if (r == row || c == col)
            return mat;
        if (r * c != row * col)
            return mat;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[ri][ci] = mat[i][j];
                ci++;
                if (ci > c - 1) {
                    ci = 0;
                    ri++;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[][] mat = { { 1, 2 }, { 3, 4 } };
        int r = 1, c = 4;
        int[][] res = matrixReshape(mat, r, c);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/**
 * In MATLAB, there is a handy function called reshape which can reshape an m x
 * n matrix into a new one with a different size r x c keeping its original
 * data.
 * 
 * You are given an m x n matrix mat and two integers r and c representing the
 * number of rows and the number of columns of the wanted reshaped matrix.
 * 
 * The reshaped matrix should be filled with all the elements of the original
 * matrix in the same row-traversing order as they were.
 * 
 * If the reshape operation with given parameters is possible and legal, output
 * the new reshaped matrix; Otherwise, output the original matrix.
 * 
 * 
 * 
 * Example 1:
 * 
 * 
 * Input: mat = [[1,2],[3,4]], r = 1, c = 4
 * Output: [[1,2,3,4]]
 * Example 2:
 * 
 * 
 * Input: mat = [[1,2],[3,4]], r = 2, c = 4
 * Output: [[1,2],[3,4]]
 */