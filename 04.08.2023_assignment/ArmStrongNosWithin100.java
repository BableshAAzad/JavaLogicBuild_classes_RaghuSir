class ArmStrongNosWithin100 {
    public static void main(String[] args) {
        ArmStrongNosWithin100.isArmStrong100(100);

    }

    static isArmStrong100(int x) {
        int dc = countDigit(100);
        int sum = 0, nValue = 100;
        for (int i = 1; i <= 100; i++) {
            int d = x % 10;
            sum = sum + power(d, dc);
            x = x / 10;
        }
        if(sum == nValue)
        System.out.println(sum);
    }

    static int countDigit(int y) {
        int count = 0;
        do {
            count++;
            y = y / 10;
        } while (y != 0);
        return count;
    }

    static int power(int d, int dc) {
        int pro = 1;
        while (dc > 0) {
            pro = pro * d;
            dc--;
        }
        return dc;
    }
}
