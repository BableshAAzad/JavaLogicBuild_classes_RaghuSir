package Stringgg.practice;

import java.util.Scanner;

public class ReverseString {
  public static void main(String[] args) {
    System.out.println("Enter a String : ");
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    sc.close();
    String rev = "";
    for (int i = 0; i < str.length(); i++) {
      rev = str.charAt(i) + rev;
    }
    if (str.equals(rev)) {
      System.out.println(true);
    } else {
      System.out.println(false);
      System.out.println(rev);
    }
  }
}