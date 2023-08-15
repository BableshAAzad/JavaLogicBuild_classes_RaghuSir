package Arrayyy;

import java.util.Scanner;

public class PrimeNosInArrayy {
    public static void main(String[] args) {
        PrimeNosInArrayy pn = new PrimeNosInArrayy();
        int[] x = pn.readArray();

        System.out.println("There prime numeber is : ");
        pn.getPrimeNumbers(x);
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
}
