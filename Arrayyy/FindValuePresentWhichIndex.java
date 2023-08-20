package Arrayyy;

import java.util.Scanner;

public class FindValuePresentWhichIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FindValuePresentWhichIndex fv = new FindValuePresentWhichIndex();
        int[] x = fv.readArray();
        System.out.println("Enter the value and check how many times present : ");
        int ele = sc.nextInt();
        int c = fv.countElem(x, ele);
        System.out.println(+ele + " value is present in index " + c);
    }

    int countElem(int[] ar, int ele) {
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == ele)
                return i;
        }
        return -1;
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
