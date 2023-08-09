package Deserium_Number;
class DeseriumNosWithin100 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean rs = isDeserium(i);
            if (rs)
                System.out.print(i + " ");
        }
    }

    static boolean isDeserium(int n) {
        int dc = digitCount(n);
        int sum = 0, temp = n;
        do {
            int d = n % 10;
            sum = sum + power(d, dc);
            dc--;
            n = n / 10;
        } while (n != 0);
        return sum == temp;
    }

    static int digitCount(int n) {
        int count = 0;
        do {
            count++;
            n = n / 10;
        } while (n != 0);
        return count;
    }

    static int power(int d, int dc) {
        int prod = 1;
        while (dc > 0) {
            prod = prod * d;
            dc--;
        }
        return prod;
    }
}
