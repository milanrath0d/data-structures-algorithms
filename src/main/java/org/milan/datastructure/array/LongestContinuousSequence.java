package org.milan.datastructure.array;

/**
 * Problem: For the given array consists of 0s and 1s find the index of 0
 * preceding the longest continuous sequence of 1s
 * <p>
 * For example: arr = [0, 1, 1, 0, 1, 1, 1, 0, 1, 1]
 * Output: 3
 *
 * @author Milan Rathod
 */
public class LongestContinuousSequence {

    /**
     * Return index of 0 preceding the longest continuous sequence
     * of 1s.
     * NOTE: will return 0 if all the numbers in given array is 0s or 1s
     */
    public int getLongestContinuousSequenceIndex(int[] arr) {
        int index = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; ) {
            // If current element is 0 then check for next longest
            // sequence of 1s and compare it with previous max
            // count and set index variable if longest sequence of 1s found
            if (arr[i] == 0) {
                int j = i;
                int count = 0;
                while (++i < arr.length && arr[i] != 0) {
                    count++;
                }

                if (count > maxCount) {
                    maxCount = count;
                    index = j;
                }
            } else {
                // If array is starting with 1s then
                i++;
            }
        }
        return index;
    }

}
