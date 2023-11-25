package Practice.Demo;

import java.util.Scanner;

public class DemoTime {
    static int diagonalSum(int[][] mat) {
        int sum = 0;
        int i = 0, j = mat.length - 1, x=mat.length;
        while (x > 0) {
            sum = sum + mat[i][i] + mat[i][j];
            i++;
            j--;
            x--;
        }
        if(mat.length%2 != 0){
            sum = sum-mat[mat.length/2][mat.length/2];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] ar = new int[3][3];
        for (int i = 0; i < ar.length; i++) {
            for (int j = 0; j < ar.length; j++) {
                ar[i][j] = sc.nextInt();
            }
        }
        int sum = diagonalSum(ar);
        System.out.println(sum);
        sc.close();
    }
}
