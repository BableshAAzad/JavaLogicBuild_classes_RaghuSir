package Stringgg;

import java.util.Scanner;

public class PangramOrNotUsingBuiltInMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        boolean rs = isPangramB(str);
        if (rs)
            System.out.println("String is pangram");
        else
            System.out.println("String is not a pangram");
    }

    static boolean isPangramB(String str) {
        if (str.length() < 26)
            return false;
        str = str.toLowerCase();
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (str.indexOf(ch) == -1)
                return false;
        }
        return true;
    }
}
