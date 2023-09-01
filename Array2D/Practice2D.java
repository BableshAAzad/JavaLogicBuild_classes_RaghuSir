package Array2D;

import java.util.Scanner;

public class Practice2D {
    public static void main(String[] args) {
        int[][] mat = readMatP();
        displayP(mat);
        int big = bigElement(mat);
        System.out.println("Biggest Elements is : " + big);
        // --------------------------------------------------------------
        int[] bigC = colWiseSum(mat);
        System.out.println("Column wise sum is : ");
        for (int i = 0; i < bigC.length; i++) {
            System.out.print(bigC[i] + " ");
        }
        System.out.println();
        // --------------------------------------------------------------
        int[][] rev = colWiseReverse(mat);
        System.out.println("After colwise reverse : ");
        displayP(rev);
    }

    static int[][] colWiseReverse(int[][] mat) {
        for (int i = 0; i < mat[0].length; i++) {
            int f = 0, l = mat.length - 1;
            while (f < l) {
                int temp = mat[f][i];
                mat[f][i] = mat[l][i];
                mat[l][i] = temp;
                f++;
                l--;
            }
        }
        return mat;
    }

    static int[] colWiseSum(int[][] mat) {
        int[] sum = new int[mat[0].length];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                sum[j] = sum[j] + mat[i][j];
            }
        }
        return sum;
    }

    private static int bigElement(int[][] mat) {
        int big = mat[0][0];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] > big)
                    big = mat[i][j];
            }
        }
        return big;
    }

    static int[][] readMatP() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the order of matrix (row*column)");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] mat = new int[row][col];
        System.out.println("Enter " + row * col + " values rowwise : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        sc.close();
        return mat;
    }

    static void displayP(int[][] mat) {
        System.out.println("User entered matrix is : ");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
