import java.util.Scanner;

public class FirstAndSecondBigestInArray {
    public static void main(String[] args) {
        int[] x = readArray();
        System.out.println("User entered arrays : ");
        dispArray(x);
        get2ndBiggestArray(x);
    }

    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    static void dispArray(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }
    }

    static void get2ndBiggestArray(int[] ar) {
        int fBig = Integer.MIN_VALUE;
        int sBig = Integer.MIN_VALUE;
        for (int i = 1; i < ar.length; i++) {
            if (ar[i] > sBig) {
                sBig = fBig;
                fBig = ar[i];
            }
            if (ar[i] > sBig && ar[i] != fBig)
                sBig = ar[i];
        }
        System.out.println("First Biggest array Number : " + fBig);
        System.out.println("Second Biggest array Number : " + sBig);
    }
}
