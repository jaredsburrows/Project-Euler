package leetcode;

/**
 * https://leetcode.com/problems/reverse-integer
 */
public final class Problem7ReverseInteger {
    // Time - O(N), Space - O(1)
    public int reverse(int x) {
        long reverseNumber = 0;

        while (x != 0) {
            // Move digit, 0 -> 30 + 2 -> 300 + 20
            long moveDigit = reverseNumber * 10;

            // Get last digit, 3 -> 2 -> 1
            long lastDigit = x % 10;

            // Keep track of reversed number, 3 -> 32 -> 321
            reverseNumber = moveDigit + lastDigit;

            // Remove last digit, 12 -> 1 -> 0
            x /= 10;
        }

        if (reverseNumber >= Integer.MAX_VALUE || reverseNumber <= Integer.MIN_VALUE) {
            return 0;
        }

        return (int) reverseNumber;
    }
}
