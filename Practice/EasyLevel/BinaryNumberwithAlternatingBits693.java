package Practice.EasyLevel;

public class BinaryNumberwithAlternatingBits693 {
    public static boolean hasAlternatingBits(int n) {
        String bin = "";
        do {
            int d = n % 2;
            bin += d;
            n = n / 2;
        } while (n != 0);
        char[] ch = bin.toCharArray();
        for (int i = 1; i < ch.length; i++) {
            if (ch[i] == ch[i - 1])
                return false;
        }
        // System.out.println(bin);
        return true;
    }

    public static void main(String[] args) {
        int n = 50;
        boolean bl = hasAlternatingBits(n);
        System.out.println(bl);
    }
}
