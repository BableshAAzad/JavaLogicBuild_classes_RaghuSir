package Test_VII_String;

import java.util.Scanner;

public class GivenWordIsPresentOrNotInMainStrQ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter main string : ");
        String ms = sc.nextLine();
        System.out.println("Enter sub string : ");
        String ss = sc.nextLine();
        boolean bl = checkPresentOrNot(ms, ss);
        if (bl)
            System.out.println("Given subString present in mainString ");
        else
            System.out.println("Word not present");
    }

    static boolean checkPresentOrNot(String ms, String ss) {
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
