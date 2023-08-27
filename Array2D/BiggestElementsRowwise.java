package Array2D;

import java.util.Scanner;

public class BiggestElementsRowwise {
    public static void main(String[] args) {
        int[][] x = readMat();
        System.out.println("User entered matrix : ");
        display(x);
        int[] bigs = rowwiseBig(x);
        for (int i = 0; i < bigs.length; i++) {
            System.out.println(i + 1 + " Row biggest element is : " + bigs[i]);
        }
    }

    static int[] rowwiseBig(int[][] mat) {
        int[] bg = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            int big = mat[i][0];
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] > big)
                    big = mat[i][j];
            }
            bg[i] = big;
        }
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
