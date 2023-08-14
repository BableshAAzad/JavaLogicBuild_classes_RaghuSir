package Arrayyy.ArrayyShortingString;

import java.util.Arrays;

public class ArrayyShortStringAscLengthAndKthFind {
    public static void main(String[] args) {
        String x[] = { "Mango", "Apple", "Mer", "Pineapple", "Ber", "Orange", "Applests" };
        int k = 2;
        ArrayyShortStringAscLengthAndKthFind ssalF = new ArrayyShortStringAscLengthAndKthFind();
        String s = ssalF.sortLength(x, k);
        System.out.println("2nd Smallest String : " + s);
        System.out.println(Arrays.toString(x));
    }

    public String sortLength(String x[], int k) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i].length() > x[j].length()) {
                    String temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
            if (i == k - 1)
                return x[i];
        }
        return null;
    }
}
