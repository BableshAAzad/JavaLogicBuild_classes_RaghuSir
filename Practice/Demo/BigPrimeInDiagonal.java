package Practice.Demo;

import java.util.Scanner;

public class BigPrimeInDiagonal {
    static int primeOrNot(int n) {
        int temp = n;
        for (int i = 2; i <= n / 2; i++) {
            if (n / i == 0)
                return 0;
        }
        return temp;
    }

    public static int diagonalPrime(int[][] nums) {
        int a = 0, b = nums.length - 1, big1 = 0, big2 = 0, big3 = 0;
        while (nums.length != 0) {
            big1 = primeOrNot(nums[a][a]);
            big2 = primeOrNot(nums[a][b]);
            if (big1 < big2)
                big1 = big2;
            a++;
            b--;
        }
        if (nums.length % 2 == 1) {
            big3 = primeOrNot(nums[nums.length / 2][nums.length / 2]);
        }
        if (big1 < big3) {
            big1 = big3;
        }
        return big1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int bigP = diagonalPrime(arr);
        System.out.println(bigP);
    }
}
