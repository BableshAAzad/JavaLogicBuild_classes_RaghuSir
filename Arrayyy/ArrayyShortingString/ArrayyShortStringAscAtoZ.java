package Arrayyy.ArrayyShortingString;

import java.util.Arrays;

public class ArrayyShortStringAscAtoZ {
    public static void main(String[] args) {
        String x[] = {"Abc", "Mango", "Apple", "Pineapple", "Orange", "Applests" };
        ArrayyShortStringAscAtoZ sa = new ArrayyShortStringAscAtoZ();
        sa.sortt(x);
        System.out.println(Arrays.toString(x));
    }

    public void sortt(String x[]) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i].compareTo(x[j]) > 0) {
                    String temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                
                }
            }
        }
    }
}
