package Plaindrom_number;
import java.util.Scanner;

class PalindromeNoOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer value : ");
        int n = sc.nextInt();
        boolean bl = isPrimePeli(n);
        if (bl)
            System.out.println(n + " is a palindrom number");
        else
            System.out.println(n + " is a not palindrom number");
    }

    static boolean isPrimePeli(int n){
        int rev = 0, initN=n;
        do{
            int d = n%10;
            rev= rev*10+d;
            n= n/10;
        }while(n>0);
        if(rev==initN)
          return true;
        else
           return false;
    }
}
