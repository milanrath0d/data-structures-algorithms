package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaximumElement}
 *
 * @author Milan Rathod
 */
class MaximumElementTest {

    @Test
    void testFind() {
        int[] arr = {1, 3, 50, 10, 9, 7, 6};

        MaximumElement maximumElement = new MaximumElement();

        int result = maximumElement.find(arr);

        assertEquals(50, result);

        arr = new int[]{1, 30, 40, 50, 60, 70, 23, 20};

        result = maximumElement.find(arr);

        assertEquals(70, result);

        arr = new int[]{1, 20, 30, 25, 24, 23, 22, 21, 20, 19, 18};

        result = maximumElement.find(arr);

        assertEquals(30, result);
    }
}