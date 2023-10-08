package Array2D;

import java.util.Scanner;

public class SpiralOrderAntiClockwise {
    public static void main(String[] args) {
        int[][] x = readMat();
        System.out.println("User entered matrix : ");
        display(x);
        System.out.println("After antiClockwise spiral : ");
        antiClockwiseSpiral(x);
    }

    static void antiClockwiseSpiral(int[][] x) {
        int n = x.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            for (int k = i; k < j; k++)
                System.out.print(x[k][i] + " ");
            for (int k = i; k < j; k++)
                System.out.print(x[j][k] + " ");
            for (int k = j; k > i; k--)
                System.out.print(x[k][j] + " ");
            for (int k = j; k > i; k--)
                System.out.print(x[i][k] + " ");
        }
        if (n % 2 == 1)
            System.out.print(x[n / 2][n / 2]);
    }

    static int[][] readMat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of a matrix (row*column) : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter " + row * col + " elements rowwise : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        return mat;
    }

    static void display(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
