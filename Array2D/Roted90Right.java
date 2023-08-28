package Array2D;

import java.util.Scanner;

public class Roted90Right {
    public static void main(String[] args) {
        int[][] x = readMat();
        System.out.println("User entered matrix : ");
        display(x);
        transePosaMatSqr(x);
        reverseRow(x);
        System.out.println("After 90 deg right roted : ");
        display(x);
    }

    static void transePosaMatSqr(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = i + 1; j < mat[i].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
    }

    static void reverseRow(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int f = 0, l = mat[0].length - 1;
            while (f < l) {
                int temp = mat[i][f];
                mat[i][f] = mat[i][l];
                mat[i][l] = temp;
                f++;
                l--;
            }
        }
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
