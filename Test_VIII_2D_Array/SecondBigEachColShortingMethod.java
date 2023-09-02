package Test_VIII_2D_Array;

public class SecondBigEachColShortingMethod {
    public static void main(String[] args) {
        int[][] mat = MainClass.readMat();
        System.out.println("User Entered matrix is : ");
        MainClass.displayMat(mat);
        int[][] sbig = secondBigM(mat);
        System.out.println("Columnwise second biggest element is : ");
        MainClass.displayMat(sbig);
        // for (int i = 0; i < sbig.length; i++) {
        // System.out.print(sbig[i] + " ");
        // }
    }

    private static int[][] secondBigM(int[][] mat) {
        // int[] sbi = new int[50];
        for (int i = 0; i < mat[0].length; i++) {
            int f = 0, l = mat.length - 1;
            while (f < l) {
                if (mat[f][i] > mat[l][i]) {
                    mat[f][i] = mat[l][i];
                    f++;
                    l--;
                }
            }
        }
        // sbi[i] = temp;
        return mat;
    }
}
