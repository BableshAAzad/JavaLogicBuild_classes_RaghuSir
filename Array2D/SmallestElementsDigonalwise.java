package Array2D;

import java.util.Scanner;

public class SmallestElementsDigonalwise {
    public static void main(String[] args) {
        int[][] x = readMat();
        System.out.println("User entered matrix : ");
        display(x);
        int[] bigd = digonalWiseSmall(x);
        for (int i = 0; i < bigd.length; i++) {
            System.out.println(i + 1 + " Digonal smallest element is : " + bigd[i]);
        }
    }

    static int[] digonalWiseSmall(int[][] mat) {
        int pSmall = mat[0][0], sSmall = mat[0][mat.length - 1];
        for (int i = 1; i < mat.length; i++) {
            if (mat[i][i] < pSmall)
                pSmall = mat[i][i];
            if (mat[i][mat.length - 1 - i] < sSmall)
                sSmall = mat[i][mat.length - 1 - i];
        }
        int[] bg = { pSmall, sSmall };
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
