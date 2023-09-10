package Test_VIII_2D_Array;

public class SecondBigEachColShortingMethodQ4 {
    public static void main(String[] args) {
        int[][] mat = MainClass.readMat();
        System.out.println("User Entered matrix is : ");
        MainClass.displayMat(mat);
        int[] sbi = secondBigM(mat);
        System.out.println("Columnwise second biggest element is : ");
        for (int i = 0; i < sbi.length; i++) {
        System.out.print(sbi[i] + " ");
        }
    }

    private static int[] secondBigM(int[][] mat) {
        int[] sbi = new int[mat[0].length];
        for (int i = 0; i < mat[0].length; i++) {
            int fbig = mat[0][i], sbig = 0;
            for (int j = 0; j < mat.length; j++) {
                if (mat[j][i] > fbig) {
                    fbig = mat[j][i];
                } else if (sbig < fbig && sbig < mat[j][i])
                    sbig = mat[j][i];
            }
            sbi[i] = sbig;
        }
        return sbi;
    }
}
