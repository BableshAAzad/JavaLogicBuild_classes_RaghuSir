package Stringgg;

import java.util.Scanner;

public class AABBBCDAAABBDmethod2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = sc.nextLine();
        sc.close();
        int i = 0, j = 1, count = 1;
        char[] ch = str.toCharArray();
        while (i < ch.length && j < ch.length) {
            if (ch[i] == ch[j]) {
                count++;
                i++;
                j++;
            } else {
                System.out.print(ch[i] + "" + count);
                i++;
                j++;
                count = 1;
            }
        }
        System.out.println(ch[i] + "" + count);
    }
}
