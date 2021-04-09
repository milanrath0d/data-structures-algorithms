package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link PeakElement}
 *
 * @author Milan Rathod
 */
class PeakElementTest {

    private PeakElement peakElement;

    @BeforeEach
    void init() {
        peakElement = new PeakElement();
    }

    @Test
    void testFind() {
        int[] arr = new int[]{1, 3, 20, 4, 1, 0};
        int result = peakElement.find(arr);
        assertEquals(2, result);

        arr = new int[]{11, 3, 1, 0};
        result = peakElement.find(arr);
        assertEquals(0, result);

        arr = new int[]{1, 11};
        result = peakElement.find(arr);
        assertEquals(1, result);
    }

    @Test
    void testFindV2() {
        int[] arr = new int[]{1, 3, 20, 4, 1, 0};
        int result = peakElement.findV2(arr);
        assertEquals(2, result);

        arr = new int[]{2, 3, 4, 5, 12};
        result = peakElement.findV2(arr);
        assertEquals(4, result);

        arr = new int[]{1, 11};
        result = peakElement.findV2(arr);
        assertEquals(1, result);
    }
}