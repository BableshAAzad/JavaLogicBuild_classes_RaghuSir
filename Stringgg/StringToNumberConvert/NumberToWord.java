package Stringgg.StringToNumberConvert;

import java.util.Scanner;

class NumberToWord {
    final private static String[] units = { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
            "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

    final private static String[] tens = { "", "", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ",
            "Eighty ", "Ninety " };

    public static String convert(int number) {
        if (number < 0) {
            throw new ArithmeticException("Number should be positive.");
        } else if (number < 20) {
            return (units[number]);
        } else if (number < 100) {
            return tens[number / 10] + ((number % 10 > 0) ? convert(number % 10) : "");
        } else if (number < 1000) {
            return units[number / 100] + " hundred" + ((number % 100 > 0) ? " and " + convert(number % 100) : "");
        } else if (number < 20000) {
            return units[number / 1000] + " Thousand " + ((number % 1000 > 0) ? convert(number % 1000) : "");
        }
        return tens[number / 10000] + ((number % 10000 > 0) ? convert(number % 10000) : "Thousand");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 0 to 99999: ");
        int num = sc.nextInt();
        System.out.println(convert(num));
    }
}
