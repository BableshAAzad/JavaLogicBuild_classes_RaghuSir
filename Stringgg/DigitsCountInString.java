package Stringgg;

import java.util.Scanner;

public class DigitsCountInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int dcount = 0;
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (ch >= 48 && ch <= 57)
                dcount++;
        }
        System.out.println(str + " in there String digits present in :" + dcount);
    }
}
