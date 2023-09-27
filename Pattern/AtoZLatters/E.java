package Pattern.AtoZLatters;

public class E {
    public static void main(String[] args) {
        int n = 7;
        for (int i = 1; i <= n; i++) {
            if (i == 1 || i == (n / 2) + 1 || i == n) {
                for (int j = 1; j <= n-1; j++)
                    System.out.print("* ");
            } else {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    // Output : 
// * * * * * * 
// *
// *
// * * * * * *
// *
// *
// * * * * * *
}
