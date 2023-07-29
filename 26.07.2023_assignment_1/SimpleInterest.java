import java.util.Scanner;
class SimpleInterest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Initial principal amount : ");
        double principal = sc.nextDouble();
        System.out.println("Enter annual interest rate : ");
        double interestRat = sc.nextDouble();
        System.out.println("Enter time in month : ");
        int month = sc.nextInt();

        double simpleInterest = (principal*interestRat*month)/100;
        System.out.println("Simple Interest : " + simpleInterest);
    }
}