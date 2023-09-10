package Test_VIII_2D_Array;

public class SpriralPrintMatQ5 {
    public static void main(String[] args) {
        int[][] x = MainClass.readMat();
        System.out.println("User entered matrix : ");
        MainClass.displayMat(x);
        System.out.println("After clockwise spiral : ");
        clockwiseSpiral(x);
    }

    static void clockwiseSpiral(int[][] x) {
        int n = x.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            for (int k = i; k < j; k++) {
                System.out.print(x[i][k] + " ");
            }
            for (int k = i; k < j; k++) {
                System.out.print(x[k][j] + " ");
            }
            for (int k = j; k > i; k--) {
                System.out.print(x[j][k] + " ");
            }
            for (int k = j; k > i; k--) {
                System.out.print(x[k][i] + " ");
            }
        }
        if (n % 2 == 1)
            System.out.print(x[n / 2][n / 2]);
    }
}
