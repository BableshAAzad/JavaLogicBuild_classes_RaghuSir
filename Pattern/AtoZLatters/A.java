package Pattern.AtoZLatters;

public class A {
    public static void main(String[] args) {
        int n = 8, space1 = n, a = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++)
                System.out.print("  ");
            if (i == (n / 2) + 1) {
                for (int j = 1; j <= space1; j++)
                    System.out.print("* ");
            } else if (i != (n / 2) + 1) {
                System.out.print("* ");
                for (int j = 1; j <= a; j++)
                    System.out.print("  ");
                if (a > 0)
                    System.out.print("* ");
                if (a == n - 1)
                    a = n + 2;
                else
                    a = a + 2;
            }
            System.out.println();
        }
    }
    // Output : 
//               * 
//             *   *
//           *      *
//         *          * 
//       * * * * * * * *
//     *                 *
//   *                    * 
// *                        *
}
