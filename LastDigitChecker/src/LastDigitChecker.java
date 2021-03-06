public class LastDigitChecker {
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (!isValid(num1) || !isValid(num2) || !isValid(num3)) {
            return false;
        }
        int count = 0;
        if (num1%10 == num2%10) {
            count++;
        }
        if (num2%10 == num3%10) {
            count++;
        }
        if (num3%10 == num1%10) {
            count++;
        }
        return (count >= 1);
    }

    public static boolean isValid(int num) {
        return ((num >= 10) && (num <= 1000));
    }
}
