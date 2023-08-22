package Stringgg.SubString;

import java.util.Scanner;

public class SubStringPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the main String : ");
        String ms = sc.nextLine();
        System.out.println("Enter the sub String : ");
        String ss = sc.nextLine();
        boolean rs = isSubString(ms, ss);
        if (rs)
            System.out.println(ss + " : IS PRESENT HERE : " + ms);
        else
           System.out.println(ss + " : IS NOT HERE : " + ms);
    }

    static boolean isSubString(String ms, String ss) {
        char[] c1 = ms.toCharArray();
        char[] c2 = ss.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            int f = i, j = 0;
            while (f < c1.length && j < c2.length && c1[f] == c2[j]) {
                f++;
                j++;
            }
            if (j == c2.length)
                return true;
        }
        return false;
    }
}
