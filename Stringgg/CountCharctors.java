package Stringgg;

import java.util.Scanner;

public class CountCharctors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentance : ");
        String str = sc.nextLine();
        sc.close();
        int count = countChars(str);
        System.out.println("Here total words present in : " + count);
    }

    private static int countChars(String str) {
        char[] ch = str.toCharArray();
        int count = 0;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ' ')
                count++;
        }
        return count;
    }
}
