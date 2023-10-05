package Pattern.Trangle;

public class DemoTree111 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            int x = n - 1;
            int temp = 0;
            for (int j = 1; j <= i; j++) {
                if (j == 1) {
                    System.out.print(i + " ");
                    temp = i;
                } else {
                    temp = temp + x;
                    System.out.print(temp + " ");
                    x--;
                }
            }
            System.out.println();
        }
        System.out.println("-------------------");
        for (int i = 1; i <= n; i++) {
            int k = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(k + " ");
                k = k + n - j;
            }
            System.out.println();
        }
    }
}
