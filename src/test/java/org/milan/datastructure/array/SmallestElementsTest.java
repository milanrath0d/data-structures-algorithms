package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SmallestElements}
 *
 * @author Milan Rathod
 */
class SmallestElementsTest {

    @Test
    void testFindSmallestElements() {
        int[] inputArray = {12, 13, 1, 10, 34, 1};
        SmallestElements smallestElements = new SmallestElements();
        List<Integer> result = smallestElements.findSmallestElements(inputArray);

        assertEquals(1, result.get(0).intValue());
        assertEquals(10, result.get(1).intValue());
    }
}