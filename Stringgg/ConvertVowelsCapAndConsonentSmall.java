package Stringgg;

import java.util.Scanner;

public class ConvertVowelsCapAndConsonentSmall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        sc.close();
        String s = vowelsOnlyUpper(str);
        System.out.println("After conversion : " + s);
    }

    private static String vowelsOnlyUpper(String str) {
        char[] ch = str.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] = (char) (ch[i] + 32);
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
                ch[i] = (char) (ch[i] - 32);
        }
        String azad = new String(ch);
        return azad;
    }
}
