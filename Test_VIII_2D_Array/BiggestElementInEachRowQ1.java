package Test_VIII_2D_Array;

public class BiggestElementInEachRowQ1 {
    public static void main(String[] args) {
        int[][] mat = MainClass.readMat();
        System.out.println("User input matrix is : ");
        MainClass.displayMat(mat);
        int[] bigR = bigRowWise(mat);
        System.out.println("Bigest elements rowwise is : ");
        for (int i = 0; i < bigR.length; i++) {
            System.out.print(bigR[i] + " ");
        }
    }

    private static int[] bigRowWise(int[][] mat) {
        int[] bigR = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int big = mat[i][0];
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] > big)
                    big = mat[i][j];
            }
            bigR[i] = big;
        }
        return bigR;
    }
}
