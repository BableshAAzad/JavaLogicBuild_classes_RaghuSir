package Stringgg;

import java.util.Scanner;

public class CountSpecialCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int spCount = 0;
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if ((ch >= 32 && ch <= 47) || (ch >= 58 && ch <= 64) || (ch >= 91 && ch <= 96))
                spCount++;
        }
        System.out.println(str + " here special charactor present in :" + spCount);
    }
}
