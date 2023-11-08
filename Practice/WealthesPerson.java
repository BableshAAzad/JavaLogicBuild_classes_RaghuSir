package Practice;

import java.util.Scanner;

public class WealthesPerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 9 values : ");
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = sumColRow(arr);
        System.out.println(sum);
    }

    private static int sumColRow(int[][] accounts) {
        int sum = 0, temp = 0;
        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum = sum + accounts[i][j];
            }
            if (sum >= temp) {
                temp = sum;
            }
            sum = 0;
        }
        return temp;
    }
}
