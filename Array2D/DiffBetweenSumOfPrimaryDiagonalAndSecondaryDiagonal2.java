package Array2D;

import java.util.Scanner;

public class DiffBetweenSumOfPrimaryDiagonalAndSecondaryDiagonal2 {
    public static void main(String[] args) {
        int[][] x = readMat();
        System.out.println("User entered matrix : ");
        display(x);
        int[] sum = digonalWiseSum(x);
        int sumF = sum[0];
        int sumS = sum[1];
        System.out.println("After sum of first diagonal elements : " + sumF);
        System.out.println("After sum of Second diagonal elements : " + sumS);
        System.out.println(
                "Difference between sum of primary diagonal and sum of secondary diagonal is : " + (sumF - sumS));
    }

    static int[] digonalWiseSum(int[][] mat) {
        int pSum = mat[0][0], sSum = mat[0][mat.length - 1];
        for (int i = 1; i < mat.length; i++) {
            pSum = pSum + mat[i][i];
            sSum = sSum + mat[i][mat.length - 1 - i];
        }
        int[] bg = { pSum, sSum };
        return bg;
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
