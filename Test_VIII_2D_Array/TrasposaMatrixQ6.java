package Test_VIII_2D_Array;

public class TrasposaMatrixQ6 {
    public static void main(String[] args) {
        int[][] x = MainClass.readMat();
        System.out.println("User entered matrix : ");
        MainClass.displayMat(x);
        transePosaMatSqr(x);
        System.out.println("After Trasposa square matrix : ");
        MainClass.displayMat(x);
    }

    static void transePosaMatSqr(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[i].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }
}
