package Test_IV_String;

import java.util.Scanner;

public class PercentageOfCharInWordsQ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String str = sc.nextLine(); //AABB or ABCD or ABAB
        perc(str);
        sc.close();
    }

    static void perc(String str) {
        char[] c = str.toCharArray();
        int[] count = new int[26];
        for (int i = 0; i < c.length; i++) {
            char ch = c[i];
            if (ch >= 'A' && ch <= 'Z')
                count[ch - 65]++;
        }
        int sum = 0;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0)
                sum += count[i];
        }
        double percent = 0.0;
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                percent = ((double) count[i] / sum) * 100;
                System.out.println((char) (i + 65) + " = " + (int) percent + "%");
            }
        }
    }
}
