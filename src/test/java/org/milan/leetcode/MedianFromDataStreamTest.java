package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MedianFromDataStream}
 *
 * @author Milan Rathod
 */
class MedianFromDataStreamTest {

    @Test
    void testOperations() {
        MedianFromDataStream medianFromDataStream = new MedianFromDataStream();

        medianFromDataStream.addNum(1);
        medianFromDataStream.addNum(2);

        assertEquals(1.5, medianFromDataStream.findMedian());

        medianFromDataStream.addNum(3);

        assertEquals(2.0, medianFromDataStream.findMedian());
    }

}