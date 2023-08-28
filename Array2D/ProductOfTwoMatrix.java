package Array2D;

import java.util.Scanner;

public class ProductOfTwoMatrix {
    public static void main(String[] args) {
        System.out.println("Enter the order of first matrix (row*column) : ");
        int[][] x = readMat();
        System.out.println("Enter the order of second matrix (row*column) : ");
        int[][] y = readMat();
        System.out.println("User entered first matrix : ");
        display(x);
        System.out.println("User entered second matrix : ");
        display(y);
        int[][] rprod = product2Mat(x, y);
        System.out.println("After product of both matrix : ");
        display(rprod);
    }

    static int[][] product2Mat(int[][] x, int[][] y) {
        if (x[0].length != y.length) {
            System.out.println("Not possible to product");
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

    static int[][] readMat() {
        Scanner sc = new Scanner(System.in);
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
