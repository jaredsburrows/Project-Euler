package leetcode;

/**
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target
 */
public final class Problem744FindSmallestLetterGreaterThanTarget {
    // Time - O(LOG(N), Space - O(1)
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters == null || letters.length == 0) {
            return target;
        }

        int length = letters.length;
        int low = 0;
        int high = length;

        // binary search
        while (low < high) {
            int middle = low + (high - low) / 2;

            if (letters[middle] > target) {
                high = middle;
            } else {
                low = middle + 1;
            }
        }

        return letters[low % length];
    }
}
