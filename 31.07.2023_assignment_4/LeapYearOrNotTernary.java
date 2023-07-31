import java.util.Scanner;

class LeapYearOrNotTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year and check leap or not :");
        int dt = sc.nextInt();
        String leapy = (dt % 4 == 0 && dt%100 != 0 || dt % 400 == 0) ? "Leap Year" : "Not a leap year";
        System.out.println(leapy);
    }
}