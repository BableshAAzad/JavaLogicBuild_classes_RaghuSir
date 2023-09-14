package Stringgg;

import java.util.Scanner;

public class ReverseSentanceInBuildMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Sentance : ");
        String st = sc.nextLine();
        sc.close();
        String str = revSentance(st);
        System.out.println(str);
    }

    private static String revSentance(String st) {
        String[] str = st.split("\\s");
        String revSentance = "";
        for (int i = str.length - 1; i >= 0; i--) {
            revSentance = revSentance + str[i] + " ";
        }
        return revSentance;
    }
}
