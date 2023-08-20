package Stringgg;

import java.util.Scanner;

public class SumOfDigitsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int dsum = 0;
        for (int index = 0; index < str.length(); index++) {
            char ch = str.charAt(index);
            if (ch >= '0' && ch <= '9')
                dsum = dsum - 48 + ch;

        }
        System.out.println("Sum of digits is :" + dsum);
    }
}
