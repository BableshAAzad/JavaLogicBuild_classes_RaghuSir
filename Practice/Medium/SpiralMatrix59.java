package Practice.Medium;

public class SpiralMatrix59 {
    public static int[][] generateMatrix(int n) {
        int[][] x = new int[n][n];
        int z = 1;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            for (int k = i; k < j; k++) {
                x[i][k] = z;
                z++;
            }
            for (int k = i; k < j; k++) {
                x[k][j] = z;
                z++;
            }
            for (int k = j; k > i; k--) {
                x[j][k] = z;
                z++;
            }
            for (int k = j; k > i; k--) {
                x[k][i] = z;
                z++;
            }
        }
        if (n % 2 == 1)
            x[n / 2][n / 2] = z;
        return x;
    }

    public static void main(String[] args) {
        int n = 3;
        int[][] arr = generateMatrix(n);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}
