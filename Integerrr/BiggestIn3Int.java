package Integerrr;
import java.util.Scanner;

class BiggestIn3Int {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 integer numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a>b && a>c)
           System.out.println(a + " is biggest");
        else if(b>c)
           System.out.println(b + " is biggest");
        else
           System.out.println(c + " is biggest");
    }
}
