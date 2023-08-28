package Array2D;

import java.util.Scanner;

public class DiffBetweenSumOfPrimaryDiagonalAndSecondaryDiagonal {
    public static void main(String[] args) {
        int[][] x = readMat();
        System.out.println("User entered matrix : ");
        display(x);
        int sumF = sumFirstDiagonal(x);
        int sumS = sumSecondDiagonal(x);
        System.out.println("After sum of first diagonal elements : " + sumF);
        System.out.println("After sum of Second diagonal elements : " + sumS);
        System.out.println(
                "Difference between sum of primary diagonal and sum of secondary diagonal is : " + (sumF - sumS));
    }

    static int sumFirstDiagonal(int[][] mat) {
        int i = 0, j = 0, sum = 0;
        while (i < mat.length) {
            sum = sum + mat[i][j];
            i++;
            j++;
        }
        return sum;
    }

    static int sumSecondDiagonal(int[][] mat) {
        int i = 0, j = mat.length - 1, sum = 0;
        while (i < mat.length) {
            sum = sum + mat[i][j];
            i++;
            j--;
        }
        return sum;
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
