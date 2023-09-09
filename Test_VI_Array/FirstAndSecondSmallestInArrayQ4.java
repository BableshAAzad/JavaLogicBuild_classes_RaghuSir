package Test_VI_Array;

import java.util.Scanner;

public class FirstAndSecondSmallestInArrayQ4 {
    public static void main(String[] args) {
        int[] ar = readArrayy();
        fstSecSmall(ar);
    }

    static void fstSecSmall(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                if (ar[i] > ar[j]) {
                    int temp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = temp;
                }
            }
        }
        System.out.println("First min is : " + ar[0]);
        System.out.println("Second min is : " + ar[1]);
    }

    static int[] readArrayy() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        // sc.close();
        return ar;
    }
}
