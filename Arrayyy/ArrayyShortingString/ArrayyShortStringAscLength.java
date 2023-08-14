package Arrayyy.ArrayyShortingString;

import java.util.Arrays;

public class ArrayyShortStringAscLength {
    public static void main(String[] args) {
        String x[] = { "Mango", "Apple", "Mer", "Pineapple", "Ber", "Orange", "Applests" };
        ArrayyShortStringAscLength ssal = new ArrayyShortStringAscLength();
        ssal.sortLength(x);
        System.out.println(Arrays.toString(x));
    }

    public void sortLength(String x[]) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i].length() > x[j].length()) {
                    String temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
    }
}
