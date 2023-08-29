package Integerrr;
import java.util.Scanner;

class OddEvenWIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer value : ");
        int n = sc.nextInt();
        switch(n%2){
            case 0 :
               System.out.println(n + " is even number");
               break;
            case 1 : 
               System.out.println(n + " is odd number");
               break;
        }
    }
}
