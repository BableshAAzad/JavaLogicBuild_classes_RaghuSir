package Arrayyy;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementInTheArrayy {
    public static void main(String[] args) {

        DeleteElementInTheArrayy ao = new DeleteElementInTheArrayy();
        System.out.println("Enter the size of array : ");
        int[] x = ao.readArraysy();
        int in = 2;
        int[] f = ao.daleteArrayy(x, in);
        System.out.println(Arrays.toString(f));
    }

    int[] readArraysy() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    int[] daleteArrayy(int[] ar, int in) {
        if (in < 0 || in >= ar.length) {
            System.out.println("Index in not in the array");
            return ar;
        }
        int[] br = new int[ar.length - 1];
        for (int i = 0; i < br.length; i++) {
            if (i < in)
                br[i] = ar[i];
            else
                br[i] = ar[i + 1];
        }
        return br;
    }
}
