package Test_I;

public class AverageDigitOf1234 {
    public static void main(String[] args) {
        double sum = 0;
        int a = 1234;
        while (a > 0) {
            int d = a % 10;
            sum = sum + d;
            a = a / 10;
        }
        double b = sum / 4;
        System.out.println("1234 of digits average is :" + b);
    }
}
