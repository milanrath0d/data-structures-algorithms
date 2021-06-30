package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link KInversePairs}
 *
 * @author Milan Rathod
 */
class KInversePairsTest {

    @Test
    void find() {
        KInversePairs kInversePairs = new KInversePairs();

        assertEquals(1, kInversePairs.find(3, 0));

        assertEquals(2, kInversePairs.find(3, 1));
    }
}