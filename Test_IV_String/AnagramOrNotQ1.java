package Test_IV_String;

import java.util.Scanner;

public class AnagramOrNotQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thee First String : ");
        String fs = sc.nextLine();
        System.out.println("Enter the second String : ");
        String ss = sc.nextLine();
        boolean bl = isAnagram(fs, ss);
        if (bl)
            System.out.println("Given String is Anagram");
        else
            System.out.println("Not a Anagram");
    }

    static boolean isAnagram(String fs, String ss) {
        int[] ct1 = countAlpha(fs);
        int[] ct2 = countAlpha(ss);
        for (int i = 0; i < 26; i++) {
            if (ct1[i] != ct2[i])
                return false;
        }
        return true;
    }

    static int[] countAlpha(String str) {
        int[] count = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                count[ch - 65]++;
            else if (ch >= 'a' && ch <= 'z')
                count[ch - 97]++;
        }
        return count;
    }
}
