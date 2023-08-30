package Arrayyy;

import java.util.Scanner;

public class PrimeNosInArrAndCount {
    public static void main(String[] args) {
        int[] ar = readArray();
        System.out.println("Here number prime numbers is : ");
        int count = isPrimeNos(ar);
        System.out.println("Total " + count + " prime number");

    }

    static int isPrimeNos(int[] ar) {
        int count = 0, nom = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = 1; j <= ar[i]; j++) {
                if (ar[i] % j == 0)
                    count++;
            }
            if (count == 2) {
                nom = nom + 1;
                System.out.println(ar[i]);
            }
            count = 0;
        }
        return nom;
    }

    static int[] readArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int n = sc.nextInt();
        int[] ar = new int[n];
        System.out.println("Enter " + n + " Values : ");
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        sc.close();
        return ar;
    }
}
