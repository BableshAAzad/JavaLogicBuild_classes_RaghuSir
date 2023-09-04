package Test_VIII_2D_Array;

public class SecondBigEachColumn {
    public static void main(String[] args) {
        int[][] mat = MainClass.readMat();
        System.out.println("User Entered matrix is : ");
        MainClass.displayMat(mat);
        int[] sbig = secondBigC(mat);
        System.out.println("Columnwise second biggest element is : ");
        for (int i = 0; i < sbig.length; i++) {
            System.out.print(sbig[i] + " ");
        }
    }

    private static int[] secondBigC(int[][] mat) {
        int[] sbi = new int[mat[0].length];
        int fbig = Integer.MIN_VALUE;
        int sbig = Integer.MIN_VALUE;
        for (int i = 0; i < mat[0].length; i++) {
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] > fbig) {
                    sbig = fbig;
                    fbig = mat[j][i];
                }
                if (mat[j][i] > sbig && mat[j][i] != fbig)
                    sbig = mat[j][i];
            }
            sbi[i] = sbig;
        }
        return sbi;
    }

}
