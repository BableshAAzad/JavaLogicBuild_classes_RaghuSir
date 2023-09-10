package Test_VIII_2D_Array;

import java.util.Scanner;

public class MultiplicationOf2MatQ2 {
    public static void main(String[] args) {
        System.out.println("Enter the details of 1st Matrix : ");
        int[][] x = readMat();
        System.out.println("Enter the details of 2st Matrix : ");
        int[][] y = readMat();
        System.out.println("User Entered 1st Matrix is : ");
        displayMat(x);
        System.out.println("User Entered 2st Matrix is : ");
        displayMat(y);
        int[][] z = muxOf2Mat(x, y);
        System.out.println("After product of both matrix : ");
        displayMat(z);
    }

    private static int[][] muxOf2Mat(int[][] x, int[][] y) {
        if (x[0].length != y.length) {
            System.out.println("Not Possible to product");
            return null;
        }
        int[][] z = new int[x.length][y[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                for (int k = 0; k < y.length; k++) {
                    z[i][j] = z[i][j] + x[i][k] * y[k][j];
                }
            }
        }
        return z;
    }

   private static int[][] readMat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Matrix (row*cloumn) : ");
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

   private static void displayMat(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
