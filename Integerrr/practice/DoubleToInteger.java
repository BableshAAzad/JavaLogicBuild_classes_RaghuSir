package Integerrr.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleToInteger {
    public static void main(String[] args) {
        double[] arr = { 2.4, 6.6, 6.7, 4.0, 2.6, 8.0 };
        List<Double> al = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            double dbl = arr[i];
            String str = dbl + "";
            String[] s = str.split("\\.");
            System.out.println(Arrays.toString(s));
            System.out.println("---------");
            int temp = Integer.parseInt(s[1]);
            if (temp == 0) {
                al.add(dbl);
            }
        }

        // -------or--------

        // for (Double dbl1 : arr) {
        //   if (dbl1 % 1 == 0)
        //       al.add(dbl1);
        // }
        System.out.println(al);
    }
}