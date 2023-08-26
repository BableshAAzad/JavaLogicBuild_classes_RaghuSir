package Test_IV_String;

import java.util.Scanner;

public class WordIsPresentOrNotInMainStringQ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thee First String : ");
        String ms = sc.nextLine();
        System.out.println("Enter the second String : ");
        String ss = sc.nextLine();
        boolean bl = wordPresentOrNot(ms, ss);
        if (bl)
            System.out.println("Sub String is present in main string");
        else
            System.out.println("sub String is not present");
    }

    static boolean wordPresentOrNot(String ms, String ss) {
        char[] c1 = ms.toCharArray();
        char[] c2 = ss.toCharArray();
        for (int i = 0; i < c1.length; i++) {
            int f = i, j = 0;
            while (f < c1.length && j < c2.length && c1[f] == c2[j]) {
                f++;
                j++;
            }
            if (j == c2.length) {
                if ((i == 0 || c1[i - 1] == ' ') && (f == c1.length || c1[f] == ' '))
                    return true;
            }
        }
        return false;
    }
}
