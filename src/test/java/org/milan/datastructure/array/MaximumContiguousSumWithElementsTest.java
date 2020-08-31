package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaximumContiguousSumWithElements}
 *
 * @author Milan Rathod
 */
class MaximumContiguousSumWithElementsTest {

    @Test
    void testSolution() {
        int[] a = {6, 1, 4, 6, 3, 2, 7, 4};

        int solution = new MaximumContiguousSumWithElements().solution(a, 3, 2);

        assertEquals(24, solution);
    }
}