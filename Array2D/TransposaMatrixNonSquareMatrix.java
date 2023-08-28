package Array2D;

import java.util.Scanner;

public class TransposaMatrixNonSquareMatrix {
    public static void main(String[] args) {
        int[][] x = readMat();
        System.out.println("User entered matrix : ");
        display(x);
        int[][] z = transePosaMatNonSqr(x);
        System.out.println("After Trasposa Non square matrix : ");
        display(z);
    }

    static int[][] transePosaMatNonSqr(int[][] mat) {
        int[][] tm = new int[mat[0].length][mat.length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                tm[j][i] = mat[i][j];
            }
        }
        return tm;
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
