package Practice;

import java.util.Scanner;

public class SplitDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        String s = splitMethod(str);
        sc.close();
        System.out.println(s);
    }

    private static String splitMethod(String str) {
        String[] s = str.split(" ");
        if (s.length == 1)
            return null;
        String newS = s[0].toUpperCase();
        return newS;
    }
}
