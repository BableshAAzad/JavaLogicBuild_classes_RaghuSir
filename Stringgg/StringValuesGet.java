package Stringgg;

import java.util.Scanner;

public class StringValuesGet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String : ");
        String str = sc.nextLine();

        System.out.println("Number of charactors : " + str.length());
        System.out.println("First charactor : " + str.charAt(0));
        System.out.println("Last charactor : " + str.charAt(str.length() - 1));
        System.out.println("3rd charactor : " + str.charAt(2));
        System.out.println("a presnt at index : " + str.indexOf('a'));
        System.out.println("z present at index : " + str.indexOf('z'));
    }
}
