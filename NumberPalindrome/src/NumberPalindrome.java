public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        // Make a copy of number arg as we will modify it with every loop iteration
        int temp = number;

        // Initialize a variable to hold the reversed number we will build up
        int reversed = 0;

        // For loop to iterate across every digit place of temp (ends when temp gets to 0)
        while (temp != 0) {

            // First time through the loop we multiply 0 and 10 (which is 0)
            // Second time onwards through the loop, we multiply 10 to give room for digit to add
            // Each time through the loop we add the last digit place of temp
            reversed = (reversed * 10) + (temp % 10);

            // We must drop the last place digit (i.e., 12321 becomes 1232)
            temp /= 10;
        }

        // Returns true if reversed number equals original number
        return (reversed == number);

        // Hope this helps.....cheers!
    }
}
