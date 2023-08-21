package Stringgg;

import java.util.Scanner;

public class SumOfNosInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        int sum = sumOfNumber(str);
        System.out.println("Sum of nuember is : " + sum);
    }

    static int sumOfNumber(String str) {
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = 0;
            char ch = str.charAt(i);
            while (ch >= '0' && ch <= '9') {
                n = n * 10 + (ch - 48);
                i++;
                if (i == str.length())
                    break;
                ch = str.charAt(i);
            }
            sum = sum + n;
        }
        return sum;
    }
}
