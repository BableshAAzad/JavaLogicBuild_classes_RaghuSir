package Stringgg;

import java.util.Scanner;

public class SwapEveryWordFirstCharToLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();
        String st = swapFirstToLast(str);
        System.out.println(" After swap 1st char to last and last char to 1st : " + st);
    }

    static String swapFirstToLast(String str) {
        char[] ch = str.toCharArray();
        int f = 0;
        for (int i = 0; i < ch.length; i++) {
            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ')
                f = i;
            else if (i == ch.length - 1 && ch[i] != ' ' || ch[i] != ' ' && ch[i + 1] == ' ') {
                char temp = ch[i];
                ch[i] = ch[f];
                ch[f] = temp;
            }
        }
        String opps = new String(ch);
        return opps;
    }
}
