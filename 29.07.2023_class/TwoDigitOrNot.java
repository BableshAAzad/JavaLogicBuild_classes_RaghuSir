import java.util.Scanner;

class TwoDigitOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a integer number :");
        int a = sc.nextInt();

        if (a>9 && a<100 || a<-9 && a>-100)
            System.out.println(a + " is a two digit number");
        else
            System.out.println(a + " is not a two digit number");
    }
}
