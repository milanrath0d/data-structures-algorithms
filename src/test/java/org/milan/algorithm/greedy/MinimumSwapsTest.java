package org.milan.algorithm.greedy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MinimumSwaps}
 *
 * @author Milan Rathod
 */
class MinimumSwapsTest {

    @Test
    void testSwapCount() {
        MinimumSwaps minimumSwaps = new MinimumSwaps();
        String s = "[]][][";

        long result = minimumSwaps.swapCount(s);

        assertEquals(2, result);

        s = "[[][]]";

        result = minimumSwaps.swapCount(s);

        assertEquals(0, result);

        s = "[]]][[";

        result = minimumSwaps.swapCount(s);

        assertEquals(3, result);
    }

    @Test
    void testSwapCountV2() {
        MinimumSwaps minimumSwaps = new MinimumSwaps();
        String s = "[]][][";

        long result = minimumSwaps.swapCountV2(s);

        assertEquals(2, result);

        s = "[[][]]";

        result = minimumSwaps.swapCountV2(s);

        assertEquals(0, result);

        s = "[]]][[";

        result = minimumSwaps.swapCountV2(s);

        assertEquals(3, result);
    }
}