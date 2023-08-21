package Stringgg;

import java.util.Scanner;

public class NumberToSentance {
    static void nw(int x, String st) {
        String[] fs = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
                "Eleven",
                "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
        String[] ts = { "", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };
        if (x < 20)
            System.out.print(fs[x]);
        else
            System.out.print(ts[x / 10] + fs[x % 10]);
        if (x != 0)
            System.out.print(st + " ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        nw(n / 10000000, "Crore");
        nw(n / 100000 % 100, "Lakh");
        nw(n / 1000 % 100, "Thousand");
        nw(n / 100 % 10, "Hundred");
        nw(n % 100, "");
    }
}
