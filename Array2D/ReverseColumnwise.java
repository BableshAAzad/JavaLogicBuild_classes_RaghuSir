package Array2D;

import java.util.Scanner;

public class ReverseColumnwise {
    public static void main(String[] args) {
        int[][] x = readMat();
        System.out.println("User entered matrix : ");
        display(x);
        reverseCol(x);
        System.out.println("After reverse column elements : ");
        display(x);
    }

    static void reverseCol(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            int f = 0, l = mat.length - 1;
            while (f < l) {
                int temp = mat[f][i];
                mat[f][i] = mat[l][i];
                mat[l][i] = temp;
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
