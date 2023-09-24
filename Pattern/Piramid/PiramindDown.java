package Pattern.Piramid;

public class PiramindDown {
    public static void main(String[] args) {
        int n = 9, space = 0, star = 9;
        for (int i = 1; i <= (n / 2) + 1; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                System.out.print("* ");
            }
            space++;
            star = star - 2;
            System.out.println();
        }
    }
}
