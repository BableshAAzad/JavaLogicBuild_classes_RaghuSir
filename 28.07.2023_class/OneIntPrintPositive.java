import java.util.Scanner;

class OneIntPrintPositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 integer value : ");
        int a = sc.nextInt();
        if (a < 0)
            a = a * -1;
        System.out.println("Entered value is : " + a);
    }
}