import java.util.Scanner;

class DigitOrNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number :");
        int n = sc.nextInt();
        if(n>=-9 && n<=9)
          System.out.println(n + " is a digit");
        else
          System.out.println(n + " is a number");
    }
}
