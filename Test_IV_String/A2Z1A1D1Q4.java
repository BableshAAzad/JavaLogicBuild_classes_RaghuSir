package Test_IV_String;

import java.util.Scanner;

public class A2Z1A1D1Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        char[] c = str.toCharArray();
        for (int i = 0; i < c.length; i++) {
            char ch = c[i];
            int count = 1;
            int f = i, n = i + 1;
            if (ch >= 'A' && ch <= 'Z') {
                if (f == c.length - 1) {
                    System.out.print(c[f]);
                    System.out.print("1");
                    break;
                }
                while (c[f] == c[n]) {
                    count++;
                    f++;
                    n++;
                    i++;
                    if (f == c.length - 1)
                        break;
                }
                System.out.print(c[f]);
                System.out.print(count);
            }
        }
        sc.close();
    }
}
