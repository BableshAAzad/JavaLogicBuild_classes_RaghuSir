package Stringgg;

import java.util.Scanner;

class AnagramOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two Strings : ");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        boolean rs = isAnagram(s1, s2);
        if (rs)
            System.out.println("String is a Anagram");
        else
            System.out.println("String is not a Anagram");
    }

    static boolean isAnagram(String s1, String s2) {
        int[] ct1 = countAlpha(s1);
        int[] ct2 = countAlpha(s2);
        for (int i = 0; i < 26; i++) {
            if (ct1[i] != ct2[i])
                return false;
        }
        return true;
    }

    static int[] countAlpha(String st) {
        int[] count = new int[26];
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);
            if (ch >= 'A' && ch <= 'Z')
                count[ch - 65]++;
            else if (ch >= 'a' && ch <= 'z')
                count[ch - 97]++;
        }
        return count;
    }
}