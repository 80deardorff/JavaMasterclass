import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        double count = 0;

        while (true) {
            boolean isInt = scanner.hasNextInt();
            if (isInt) {
                count++;
                int num = scanner.nextInt();
                sum += num;
            } else {
                if (count == 0) {
                    count++;
                }
                break;
            }
            scanner.nextLine();
        }
        long avg = Math.round(sum / count);
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
