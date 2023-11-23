package Practice.EasyLevel;

public class NumberofSegmentsinaString434 {
    public static int countSegments(String s) {
        if (s.length() == 0)
            return 0;
        String[] str = s.split(" ");
        int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i].length() > 0)
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        // String s = ""; // 0
        String s = ", , , ,        a, eaefa"; // 6

        int res = countSegments(s);
        System.out.println(res);
    }
}
