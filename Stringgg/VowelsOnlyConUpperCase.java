package Stringgg;

import java.util.Scanner;

public class VowelsOnlyConUpperCase {
    static String isVowelsUpperCase(String st) {
        char[] ch = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] = (char) (ch[i] + 32);
            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u') {
                ch[i] = (char) (ch[i] - 32);
            }
        }
        String str = new String(ch);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        String st = isVowelsUpperCase(str);
        System.out.println(str + " : after conversion Uppercase Wovels : " + st);
    }
}
