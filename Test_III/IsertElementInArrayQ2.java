package Test_III;

import java.util.Scanner;

public class IsertElementInArrayQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int[] x = readArr();
        System.out.println("Enter the position of element : ");
        int n = sc.nextInt();
        System.out.println("Enter the new element : ");
        int ele = sc.nextInt();
        int[] z = insertEle(x, n, ele);
        System.out.println("The new array is : ");
        display(z);
    }

    static int[] insertEle(int[] ar, int n, int ele) {
        if (n < 0 || n > ar.length) {
            System.out.println("Index not present");
            return ar;
        }
        int[] z = new int[ar.length + 1];
        for (int i = 0; i < ar.length; i++) {
            if (i < n)
                z[i] = ar[i];
            else
                z[i + 1] = ar[i];
        }
        z[n] = ele;
        return z;
    }

    static int[] readArr() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter the " + n + " values : ");
        for (int i = 0; i < n; i++) {
            ar[i] = sc.nextInt();
        }
        return ar;
    }

    static void display(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
        System.out.println();
    }
}
