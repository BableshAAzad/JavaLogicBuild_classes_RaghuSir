class Demox {
    static int factorialX(int x) {
        int sum = 1;
        for (int i = 1; i <= x; i++) {
            sum = sum * i;
        }
        System.out.println(sum);
        return sum;
    }

    static int countDigit(int y) {
        int count = 0;
        do {
            int d = y % 10;
            // System.out.println(d+" ");
            count = count + d;
            y = y / 10;
        //    System.out.println(y+" ");
        } while (y != 0);
        // System.out.println(count);
        return count;
    }
    static int facto(int z) {
        int f = 1;
        while (z > 1) {
            f = f * z;
            z--;
        }
        // System.out.println(f);
        return f;
    }

    public static void main(String[] args) {
        factorialX(3);
        countDigit(143);
        facto(3);
    }
}
