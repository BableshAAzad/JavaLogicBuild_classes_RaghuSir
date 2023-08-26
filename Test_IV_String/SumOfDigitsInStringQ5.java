package Test_IV_String;

public class SumOfDigitsInStringQ5 {
    public static void main(String[] args) {
        String str = "TEST27STRING60";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            int n = 0;
            char ch = str.charAt(i);
            while (ch >= '0' && ch <= '9') {
                n = n * 10 + (ch - 48);
                i++;
                if (i == str.length())
                    break;
                ch = str.charAt(i);
            }
            sum = sum + n;
        }
        System.out.println("Sum is : " + sum);
    }
}