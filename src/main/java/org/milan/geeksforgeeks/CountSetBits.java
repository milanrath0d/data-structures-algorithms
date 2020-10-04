package org.milan.geeksforgeeks;

/**
 * Refer: {@link @https://www.geeksforgeeks.org/count-set-bits-in-an-integer/}
 *
 * @author Milan Rathod
 */
public class CountSetBits {

    private static final int[] NUMBER_TO_BITS = new int[]{0, 1, 1, 2, 1, 2, 2, 3, 1, 2, 2, 3, 2, 3, 3, 4};

    /**
     * Time complexity: O(logn)
     *
     * @param number given number
     * @return number of set bits
     */
    public int count(int number) {
        int count = 0;
        while (number > 0) {
            count += number & 1;
            number >>= 1;
        }
        return count;
    }

    /**
     * Time and Space complexity: O(1)
     *
     * @param number given number
     * @return number of set bits
     */
    public int countV2(int number) {
        if (number == 0) {
            return NUMBER_TO_BITS[0];
        }
        int nibble = number & 0xf;

        return NUMBER_TO_BITS[nibble] + countV2(number >> 4);
    }
}
