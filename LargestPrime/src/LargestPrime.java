public class LargestPrime {
    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                for (int j = (int)Math.sqrt(i); j > 0; j--) {
                    if (j == 1) {
                        return i;
                    }
                    if (i % j == 0) {
                        break;
                    }
                }
            }
        }
        return -1;
    }
}
