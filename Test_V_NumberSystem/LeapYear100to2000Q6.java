package Test_V_NumberSystem;

public class LeapYear100to2000Q6 {
    public static void main(String[] args) {
        for (int i = 100; i <= 2000; i++) {
            boolean bl = leapOrNot(i);
            if (bl)
                System.out.print(i + " ");
        }
    }

    static boolean leapOrNot(int n) {
        if (n % 4 == 0 & n % 100 != 0 || n % 400 == 0)
            return true;
        return false;
    }
}
