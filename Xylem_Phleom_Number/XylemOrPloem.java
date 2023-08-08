package Xylem_Phleom_Number;
import java.util.Scanner;

class XylemOrPloem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int n = sc.nextInt();
        String st = checkXP(n);
        System.out.println(n + " is a " + st + " number");
    }

    static String checkXP(int x) {
        int es = 0, ms = 0, t = x;
        do {
            int d = x % 10;
            if (t == x || x == d)
                es = es + d;
            else
                ms = ms + d;
            x = x / 10;
        } while (x > 0);
        if (ms == es)
            return "Xylem";
        else
            return "Phloem";
    }
}
