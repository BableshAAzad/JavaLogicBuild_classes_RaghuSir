package Practice2.Day5;

import java.util.Scanner;

public class _27PalindromeStringOrNot {
    public static int isPalindrome(String input1) {
        /*
         * Madam, madam,madaM, all are palindromes
         * if palindrome return 2
         * else return 1
         */
        input1 = input1.toLowerCase();
        int i, flag = 1;
        for (i = 0; i < input1.length() / 2; i++) {
            if (input1.charAt(i) != input1.charAt(input1.length() - i - 1)) {
                flag = 0;
                break;
            }
        }
        if (flag == 0)
            return 1;
        return 2;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String s = sc.next();
        int i = isPalindrome(s);
        System.out.println(i == 2 ? "Palindrome" : "Not palindrome");
        sc.close();
    }
}
