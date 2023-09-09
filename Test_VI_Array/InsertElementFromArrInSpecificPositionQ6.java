package Test_VI_Array;

import java.util.Scanner;

public class InsertElementFromArrInSpecificPositionQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " values");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println("Inset index value : ");
        int in = sc.nextInt();
        System.out.println("Insert element : ");
        int ele = sc.nextInt();
        System.out.println("Before inserting element : ");
        displayi(ar);
        System.out.println();
        int[] br = insertEle(ar, in, ele);
        System.out.println("After inseting new element : ");
        displayi(br);
    }

    private static int[] insertEle(int[] ar, int in, int ele) {
        int[] br = new int[ar.length + 1];
        if (in < 0 && in > ar.length) {
            return null;
        } else {
            for (int i = 0; i < ar.length; i++) {
                if (in > i)
                    br[i] = ar[i];
                else
                    br[i + 1] = ar[i];
            }
            br[in] = ele;
        }
        return br;
    }

    static void displayi(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }
}
