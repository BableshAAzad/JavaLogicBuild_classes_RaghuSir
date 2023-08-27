package Array2D;

import java.util.Scanner;

public class ProductColumnwise {
    public static void main(String[] args) {
        int[][] x = readMat();
        System.out.println("User entered matrix : ");
        display(x);
        int[] cprod = columnProduct(x);
        for (int i = 0; i < cprod.length; i++) {
            System.out.println(i + 1 + " Column elements product is : " + cprod[i]);
        }
    }

    static int[] columnProduct(int[][] mat) {
        int[] prod = new int[mat[0].length];
        for (int i = 0; i < mat[0].length; i++) {
            prod[i] = 1;
            for (int j = 0; j < mat.length; j++) {
                prod[i] = prod[i] * mat[j][i];
            }
        }
        return prod;
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
