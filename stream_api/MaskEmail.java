package stream_api;

public class MaskEmail {
    public static void main(String[] args) {
        String email = "Bablesh.aazad@accenture.com";
        String maskedEmail = maskEmail(email);
        String maskedEmail2 = maskEmail2(maskedEmail);

        System.out.println("Output1: " + maskedEmail); // Output1: B************@accenture.com
        System.out.println("Output2: " + maskedEmail2); //Output2: B************@accenture.com

    }

    public static String maskEmail(String email) {
        String[] parts = email.split("@");
        String localPart = parts[0];
        String domainPart = parts[1];

        String maskedLocal = localPart.charAt(0) + "*".repeat(localPart.length() - 1);
        return maskedLocal + "@" + domainPart;
    }

    // & or-----------------------------

    public static String maskEmail2(String email) {
        String[] s = email.split("@");

        String temp = s[0];

        char res = temp.charAt(0);

        char[] ch = temp.toCharArray();

        String result = "";

        for (int i = 1; i < ch.length; i++) {
            result += '*';
        }
        result += "@" + s[1];
        result = res + result;
        return result;
    }
}
