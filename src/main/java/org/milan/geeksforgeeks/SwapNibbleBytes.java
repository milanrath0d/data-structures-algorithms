package org.milan.geeksforgeeks;

/**
 * Refer {@link @https://www.geeksforgeeks.org/swap-two-nibbles-byte/}
 *
 * @author Milan Rathod
 */
public class SwapNibbleBytes {

    /**
     * Time and Space complexity: O(1)
     */
    public int swap(int x) {

        // This expression gives us last 4 digits of x
        int last = x & 0x0f;

        // This expression gives us first 4 digits of x
        int first = x & 0xf0;

        return (last << 4 | first >> 4);
    }
}
