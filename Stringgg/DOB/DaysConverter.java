package Stringgg.DOB;

public class DaysConverter {
    public static int[] convertDaysToYearsMonthsDays(int days) {
        int years = days / 365;
        int remainingDays = days % 365;
        int months = remainingDays / 30;
        remainingDays = remainingDays % 30;

        return new int[]{years, months, remainingDays};
    }

    public static void main(String[] args) {
        int days = 9222;
        int[] result = convertDaysToYearsMonthsDays(days);
        
        int years = result[0];
        int months = result[1];
        int remainingDays = result[2];

        System.out.println(days + " days is approximately " + years + " years, " + months + " months, and " + remainingDays + " days.");
    }
}