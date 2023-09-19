package PatternUsingForLoop.Piramid;

public class PiramidABCD {
    public static void main(String[] args) {
        int n = 5, b = 1, a = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= a; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= b; j++) {
                System.out.print((char) (64 + j) + " ");
            }
            a--;
            b = b + 2;
            System.out.println();
        }
    }
}
