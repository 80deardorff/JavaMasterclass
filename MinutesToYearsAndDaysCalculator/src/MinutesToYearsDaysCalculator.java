public class MinutesToYearsDaysCalculator {

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 365L / 24L / 60L;
            long days = (minutes / 24L / 60L) % 365L;
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
