import java.util.Scanner;

class TwoDoubleValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Double value A : ");
        double a = sc.nextDouble();
        System.out.println("Enter Second Double value B : ");
        double b = sc.nextDouble();

        double sum = a + b;
        double mux = a * b;
        double sub = a - b;
        double div = a / b;
        double mod = a % b;
        System.out.println("A+B : " + sum);
        System.out.println("A*B : " + mux);
        System.out.println("A-B : " + sub);
        System.out.println("A/B : " + div);
        System.out.println("A%B : " + mod);
    }
}