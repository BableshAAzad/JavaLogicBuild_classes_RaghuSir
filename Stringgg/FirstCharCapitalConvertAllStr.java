package Stringgg;

import java.util.Scanner;

public class FirstCharCapitalConvertAllStr {
    static String isirstCharUpperCase(String st) {
        char[] ch = st.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') {
                if (ch[i] >= 'a' && ch[i] <= 'z')
                    ch[i] = (char) (ch[i] - 32);
            } else if (ch[i] >= 'A' && ch[i] <= 'Z')
                ch[i] = (char) (ch[i] + 32);
        }
        String str = new String(ch);
        return str;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        String st = isirstCharUpperCase(str);
        System.out.println("After conversion first Latters Uppercase : " + st);
    }
}
