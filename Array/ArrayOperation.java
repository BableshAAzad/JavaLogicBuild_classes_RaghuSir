package Array;

import java.util.Scanner;

public class ArrayOperation {
    int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    void display(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }
    }

    int getBiggest(int[] ar) {
        int big = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > big)
                big = ar[i];
        }
        return big;
    }

    int getSmallest(int[] ar) {
        int small = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] < small)
                small = ar[i];
        }
        return small;
    }

    int getSum(int[] ar) {
        int sum = 0;
        for (int i = 0; i <= ar.length; i++) {
            sum = sum + i;
        }
        return sum;
    }

    void getPrimeNumbers(int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j <= ar[i]; j++) {
                if (ar[i] % j == 0)
                    count++;
            }
            if (count == 2)
                System.out.println(ar[i] + " ");
            count = 0;
        }

    }

    void getPalindrom(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j <= ar[i]; j++) {
                int rev = 0;
                do {
                    int d = ar[i] % 10;
                    rev = rev * 10 + d;
                    ar[i] = ar[i] / 10;
                } while (ar[i] > 0);
                if (rev == ar[i])
                    System.out.print(ar[i] + " ");
                rev = 0;
            }
        }
    }

}
