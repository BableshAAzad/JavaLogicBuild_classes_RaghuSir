package Practice2.Day1;

import java.util.Scanner;

public class AllThreeDigitPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Integer number : ");
        int num = sc.nextInt();
        treeDigitPalindrome(num);
        sc.close();
    }

    private static void treeDigitPalindrome(int num) {
        for (int i = 1; i <= num; i++) {
            boolean bl = checkPalindrome(i);
            if (bl && (i + "").length() == 3) {
                System.out.println(i);
            }
        }
    }

    static boolean checkPalindrome(int num) {
        int temp = 0, backup = num;
        do {
            int digit = num % 10;
            temp = 10 * temp + digit;
            num = num / 10;
        } while (num != 0);
        return temp == backup;
    }
}
