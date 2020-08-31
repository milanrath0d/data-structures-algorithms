package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link RotationCount}
 *
 * @author Milan Rathod
 */
class RotationCountTest {

    private RotationCount rotationCount;

    @BeforeEach
    void setup() {
        rotationCount = new RotationCount();
    }

    @Test
    void testFind_Rotated() {
        int[] input = new int[]{15, 18, 2, 3, 6, 12};

        int result = rotationCount.find(input);

        assertEquals(2, result);
    }

    @Test
    void testFind_NotRotated() {
        int[] input = new int[]{7, 9, 11, 12, 15};

        int result = rotationCount.find(input);

        assertEquals(0, result);
    }

    @Test
    void testFindUsingBinarySearch_Rotated() {
        int[] input = new int[]{15, 18, 2, 3, 6, 12};

        int result = rotationCount.findUsingBinarySearch(input);

        assertEquals(2, result);
    }

    @Test
    void testFindUsingBinarySearch_NotRotated() {
        int[] input = new int[]{7, 9, 11, 12, 15};

        int result = rotationCount.findUsingBinarySearch(input);

        assertEquals(0, result);
    }
}