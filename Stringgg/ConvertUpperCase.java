package Stringgg;

import java.util.Scanner;

public class ConvertUpperCase {
    static String toUpperCase(String st) {
        char[] ch = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] >= 'a' && ch[i] <= 'z')
                ch[i] = (char) (ch[i] - 32);
        }
        String str = new String(ch);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        String st = toUpperCase(str);
        System.out.println(str + " : after conversion Uppercase : " + st);
    }
}
