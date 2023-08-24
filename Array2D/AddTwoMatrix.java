package Array2D;

import java.util.Scanner;

public class AddTwoMatrix {
    public static void main(String[] args) {
        System.out.println("Enter the order of 1st matrix (row*column) : ");
        int[][] x = readMat();
        System.out.println("Enter the order of 2nd matrix (row*column) : ");
        int[][] y = readMat();
        System.out.println("User Entered first matrix : ");
        display(x);
        System.out.println("User Entered first matrix : ");
        display(y);
        int[][] z = addMat(x, y);
        if (z == null)
            System.out.println("Addition failed");
        else {
            System.out.println("After Added matrix : ");
            display(z);
        }
    }

    static int[][] addMat(int[][] a, int[][] b) {
        if (a.length != b.length || a[0].length != b[0].length)
            return null;
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
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
