package Arrayyy.ArrayyShortingIntiger;

import java.util.Arrays;

public class ArrayyShortAscAndKthSmallest {
    public static void main(String[] args) {
        int k = 2;
        int x[] = { 2, 6, 7, 4, 1, 23, 12, 10, 8 };
        ArrayyShortAscAndKthSmallest asd = new ArrayyShortAscAndKthSmallest();
        System.out.println("Sorting : ");
        asd.sortS(x);
        System.out.println(Arrays.toString(x));
        System.out.println("-----------------------------------");
        int a = asd.nthSmallest(x, k);
        if (a != -1)
            System.out.println("Kth smallest : " + a);
        else
            System.out.println("Enrollment not there !!!");
    }

    public int nthSmallest(int x[], int k) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
            if (i == k - 1)
                return x[i];
        }
        return -1;
    }

    public void sortS(int x[]) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }
}
