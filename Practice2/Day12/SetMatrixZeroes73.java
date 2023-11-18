package Practice2.Day12;

import java.util.Scanner;

public class SetMatrixZeroes73 {
    public static void setZeroes(int[][] matrix) {
        // int[][] mat = new int[matrix.length][matrix[0].length];
        boolean[][] bl = new boolean[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (bl[i][j] == false) {
                    if (matrix[i][j] == 0) {
                        for (int k = 0; k < matrix.length; k++) {
                            if (matrix[k][j] != 0) {
                                bl[k][j] = true;
                                matrix[k][j] = 0;
                            }
                        }
                        for (int k = 0; k < matrix[0].length; k++) {
                            if (matrix[i][k] != 0) {
                                matrix[i][k] = 0;
                                bl[i][k] = true;
                            }
                        }
                    } else
                        matrix[i][j] = matrix[i][j];
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter m*n number : ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        System.out.println("Enter " + (m * n) + " values : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        setZeroes(arr);
    }
}
