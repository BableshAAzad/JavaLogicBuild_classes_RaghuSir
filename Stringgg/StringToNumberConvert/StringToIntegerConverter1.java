package Stringgg.StringToNumberConvert;

import java.util.HashMap;
import java.util.Scanner;

public class StringToIntegerConverter1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string representation of a number: ");
        String input = scanner.nextLine();
        scanner.close();

        long result = convertStringToLong(input);

        System.out.println("Input: " + input);
        System.out.println("Output: " + result);
    }

    public static long convertStringToLong(String input) {
        // Create a mapping of words to their numeric values
        HashMap<String, Long> wordToValue = new HashMap<>();
        wordToValue.put("zero", 0L);
        wordToValue.put("one", 1L);
        wordToValue.put("two", 2L);
        wordToValue.put("three", 3L);
        wordToValue.put("four", 4L);
        wordToValue.put("five", 5L);
        wordToValue.put("six", 6L);
        wordToValue.put("seven", 7L);
        wordToValue.put("eight", 8L);
        wordToValue.put("nine", 9L);
        wordToValue.put("ten", 10L);
        wordToValue.put("eleven", 11L);
        wordToValue.put("twelve", 12L);
        wordToValue.put("thirteen", 13L);
        wordToValue.put("fourteen", 14L);
        wordToValue.put("fifteen", 15L);
        wordToValue.put("sixteen", 16L);
        wordToValue.put("seventeen", 17L);
        wordToValue.put("eighteen", 18L);
        wordToValue.put("nineteen", 19L);
        wordToValue.put("twenty", 20L);
        wordToValue.put("thirty", 30L);
        wordToValue.put("forty", 40L);
        wordToValue.put("fifty", 50L);
        wordToValue.put("sixty", 60L);
        wordToValue.put("seventy", 70L);
        wordToValue.put("eighty", 80L);
        wordToValue.put("ninety", 90L);
        wordToValue.put("hundred", 1000L);
        wordToValue.put("thousand", 1000L);
        wordToValue.put("lakh", 100000L);

        String[] words = input.split(" ");
        long result = 0L;
        long currentNumber = 0L;

        for (String word : words) {
            long value = wordToValue.get(word);
            if (value == 100000L) {
                result += currentNumber * value;
                currentNumber = 0L;
            } else if (value == 1000L) {
                currentNumber *= value;
            } else {
                currentNumber += value;
            }
        }

        result += currentNumber;
        return result;
    }
}
