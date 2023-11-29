package Practice.EasyLevel;

public class LicenseKeFormatting482 {
    public static String licenseKeyFormatting(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                sb.append((char) (s.charAt(i) - 32));
                count++;
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                sb.append(s.charAt(i));
                count++;
            } else if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                sb.append(s.charAt(i));
                count++;
            }
            if (count == k) {
                sb.append("-");
                count = 0;
            }
        }
        sb.reverse();
        if (sb.length() == 0)
            return "";
        System.out.println(sb);
        if (sb.charAt(0) == '-')
            sb.setCharAt(0, ' ');
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        // String s = "5F3Z-2e-9-w";
        // int k = 4; // 5F3Z-2E9W

        // String s = "2-5g-3-J";
        // int k = 2; // 2-5G-3J

        // String s = "5F3-2e-9-w-jdd-33dj-3";
        // int k = 4; // 5F3Z-2E9W

        String s = "---";
        int k = 3; //
        String res = licenseKeyFormatting(s, k);
        System.out.println(res);
    }
}
/**
 * You are given a license key represented as a string s that consists of only
 * alphanumeric characters and dashes. The string is separated into n + 1 groups
 * by n dashes. You are also given an integer k.
 * 
 * We want to reformat the string s such that each group contains exactly k
 * characters, except for the first group, which could be shorter than k but
 * still must contain at least one character. Furthermore, there must be a dash
 * inserted between two groups, and you should convert all lowercase letters to
 * uppercase.
 * 
 * Return the reformatted license key.
 * 
 * Example 1:
 * 
 * Input: s = "5F3Z-2e-9-w", k = 4
 * Output: "5F3Z-2E9W"
 * Explanation: The string s has been split into two parts, each part has 4
 * characters.
 * Note that the two extra dashes are not needed and can be removed.
 * Example 2:
 * 
 * Input: s = "2-5g-3-J", k = 2
 * Output: "2-5G-3J"
 * Explanation: The string s has been split into three parts, each part has 2
 * characters except the first part as it could be shorter as mentioned above.
 */