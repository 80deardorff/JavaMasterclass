public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
        if ((num1 < 10) || (num1 > 99) || (num2 < 10) || (num2 > 99)) {
            return false;
        }
        return ((num1/10 == num2/10) || (num1/10 == num2%10) || (num1%10 == num2/10) || (num1%10 == num2%10));
    }
}
