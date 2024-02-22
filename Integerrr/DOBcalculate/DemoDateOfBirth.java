package Integerrr.DOBcalculate;

import java.util.Date;
import java.util.Scanner;

public class DemoDateOfBirth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Date of Birth YYYY-MM-DD : ");
        Date d = new Date();
        String dd = d.toString();
        String temp ="";
        for (int i = dd.length()-1; i >= 24; i--) {
            temp = dd.charAt(i) + temp;
        }
        System.out.println(temp+ " "+(d.getMonth()+1)+" "+d.getDate());
        int yy = Integer.parseInt(temp);
        System.out.println((d.getTime()/(24 * 60 * 60 * 1000)));
    }
}
