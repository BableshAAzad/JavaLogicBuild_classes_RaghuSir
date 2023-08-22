package Stringgg.SubString;

import java.util.Scanner;

public class SubStringReplaceWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main String : ");
        String ms = sc.nextLine();
        System.out.println("Enter the sub String : ");
        String ss = sc.nextLine();
        System.out.println("Enter the replacing String : ");
        String rs = sc.nextLine();
        String res = replaceAll(ms, ss, rs);
        System.out.println(res);
    }

    static String replaceAll(String ms, String ss, String rs) {
        char[] c1 = ms.toCharArray();
        char[] c2 = ss.toCharArray();
        String str = "";
        for (int i = 0; i < c1.length; i++) {
            int f = i, j = 0;
            while (f < c1.length && j < c2.length && c1[f] == c2[j]) {
                f++;
                j++;
            }
            if (j == c2.length) {
                if ((i == 0 || c1[i - 1] == ' ') && (f == c1.length || c1[f] == ' ')) {
                    str = str + rs;
                    i = f - 1;
                    continue;
                }
            }
            str = str + c1[i];
        }
        return str;
    }
}
