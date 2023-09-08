package Arrayyy;

import java.util.Scanner;

public class MissingElementsInShortedArrayMethod1 {
    public static void main(String[] args) {
        int[] ar = readArray();
        int[] br = missingEle(ar);
        for (int i = 0; i < br.length; i++) {
            if (br[i] != 0)
                System.out.print(br[i] + " ");
        }
    }

    static int[] missingEle(int[] ar) {
        int big = ar[0];
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > big)
                big = ar[i];
        }
        int[] br = new int[big];
        int bri = 0;
        for (int i = 0; i < ar.length - 1; i++) {
            int f = ar[i] + 1;
            int l = ar[i + 1];
            while (f < l) {
                br[bri] = f;
                f++;
                bri++;
            }
        }
        return br;
    }

    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        sc.close();
        return ar;
    }
}
