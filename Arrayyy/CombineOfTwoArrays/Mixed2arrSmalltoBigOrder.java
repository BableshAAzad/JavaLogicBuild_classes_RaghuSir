package Arrayyy.CombineOfTwoArrays;

import java.util.Scanner;

public class Mixed2arrSmalltoBigOrder {
    public static void main(String[] args) {
        Mixed2arrSmalltoBigOrder ao = new Mixed2arrSmalltoBigOrder();
        System.out.println("Enter the size of 1st first : ");
        int[] x = ao.readArraysy();
        System.out.println("Enter the size of 2nd array : ");
        int[] y = ao.readArraysy();
        System.out.println("User enter first array : ");
        ao.displ(x);
        System.out.println("User enter second array : ");
        ao.displ(y);
        int[] z = ao.smallToBig(x, y);
        System.out.println("After arrange small to big : ");
        ao.displ(z);
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

    void displ(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.println(ar[i] + " ");
        }
    }
    int[] smallToBig(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k=0;
        while (i < a.length && j < b.length) {
            if(a[i]<b[j]){
                c[k]=a[i];
                k++;
                i++;
            }
            else{
                c[k]=b[j];
                k++;
                j++;
            }
        }
        while (i < a.length) {
            c[k] = a[i];
            k++;
            i++;
        }
        while (j < b.length) {
            c[k] = b[j];
            k++;
            j++;
        }
        return c;
    }
}
