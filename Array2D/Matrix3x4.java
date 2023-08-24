package Array2D;

public class Matrix3x4 {
    public static void main(String[] args) {
        int[][] mat = { { 13, 44, 54, 23 }, { 53, 22, 45, 22 }, { 53, 53, 22, 55 } };
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
