package Perfect_Number;
class PefectNoWithin100M {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean rs = is100Perfect(i);
            if (rs == true) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean is100Perfect(int x) {
        int sum = 0, base = x;
        for (int i = 1; i <= x / 2; i++) {
            if (x % i == 0)
                sum = sum + i;
        }
        if (sum == base)
            return true;
        return false;
    }
}