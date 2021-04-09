package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link LargestRectangularAreaInHistogram}
 *
 * @author Milan Rathod
 */
class LargestRectangularAreaInHistogramTest {

    @Test
    void testFindLargestRectangularArea() {
        LargestRectangularAreaInHistogram largestRectangularAreaInHistogram = new LargestRectangularAreaInHistogram();

        int result = largestRectangularAreaInHistogram.findLargestRectangularArea(new int[]{6, 2, 5, 4, 5, 1, 6});

        assertEquals(12, result);
    }
}