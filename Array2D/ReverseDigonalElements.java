package Array2D;

import java.util.Scanner;

public class ReverseDigonalElements {
    public static void main(String[] args) {
        int[][] x = readMat();
        System.out.println("User entered matrix : ");
        display(x);
        digonalReverse(x);
        System.out.println("After reverse the diagonal elements : ");
        display(x);
    }

    static void digonalReverse(int[][] mat) {
        int f = 0, l = mat.length - 1;
        while (f < l) {
            int temp = mat[f][f];
            mat[f][f] = mat[l][l];
            mat[l][l] = temp;

            temp = mat[f][l];
            mat[f][l] = mat[l][f];
            mat[l][f] = temp;
            f++;
            l--;
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
