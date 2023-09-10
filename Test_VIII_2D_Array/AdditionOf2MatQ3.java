package Test_VIII_2D_Array;

public class AdditionOf2MatQ3 {
    public static void main(String[] args) {
        System.out.println("Enter the details of 1st Matrix : ");
        int[][] x = MainClass.readMat();
        System.out.println("Enter the details of 2st Matrix : ");
        int[][] y = MainClass.readMat();
        System.out.println("User Entered 1st Matrix is : ");
        MainClass.displayMat(x);
        System.out.println("User Entered 2st Matrix is : ");
        MainClass.displayMat(y);
        int[][] z = additionOf2Mat(x, y);
        System.out.println("After Addition of both matrix : ");
        MainClass.displayMat(z);
    }

    private static int[][] additionOf2Mat(int[][] x, int[][] y) {
        if (x.length != y.length) {
            System.out.println("Not Possible to addtion");
            return null;
        }
        int[][] z = new int[x.length][y[0].length];
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                z[i][j] = x[i][j] + y[i][j];
            }
        }
        return z;
    }
}
