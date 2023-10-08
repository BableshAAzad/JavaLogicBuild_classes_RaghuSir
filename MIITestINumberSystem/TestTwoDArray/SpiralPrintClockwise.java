package MIITestINumberSystem.TestTwoDArray;

import java.util.Scanner;

public class SpiralPrintClockwise {
    public static void main(String[] args) {
        int[][] mat = readMat();
        System.out.println("User input matrix is : ");
        display(mat);
        clockSpiral(mat);
    }

    private static void clockSpiral(int[][] mat) {
        int n = mat.length;
        for (int i = 0, j = n - 1; i < j; i++, j--) {
            for (int k = i; k < j; k++)
                System.out.print(mat[i][k] + " ");
            for (int k = i; k < j; k++)
                System.out.print(mat[k][j] + " ");
            for (int k = j; k > i; k--)
                System.out.print(mat[j][k] + " ");
            for (int k = j; k > i; k--)
                System.out.print(mat[k][i] + " ");
        }
        if (n % 2 ==1)
            System.out.print(mat[n / 2][n / 2]);
    }

    private static int[][] readMat() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter matix size (ror*col) : ");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter " + row * col + " values : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
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
