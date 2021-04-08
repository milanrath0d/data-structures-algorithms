package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LongestContinuousSequence}
 *
 * @author Milan Rathod
 */
class LongestContinuousSequenceTest {

    @Test
    void getLongestContinuousSequenceIndex() {
        LongestContinuousSequence longestContinuousSequence = new LongestContinuousSequence();

        int[] arr = new int[]{0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1};

        int index = longestContinuousSequence.getLongestContinuousSequenceIndex(arr);

        assertEquals(5, index);
    }
}