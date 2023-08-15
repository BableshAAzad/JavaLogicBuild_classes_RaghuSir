package Arrayyy;

import java.util.Scanner;

public class ReadArrayAndDisplay {
    public static void main(String[] args) {
        ReadArrayAndDisplay rd = new ReadArrayAndDisplay();
        int[] x = rd.readArray();
        System.out.println("User enter array : ");
        rd.display(x);
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

    void display(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }
    }

}
