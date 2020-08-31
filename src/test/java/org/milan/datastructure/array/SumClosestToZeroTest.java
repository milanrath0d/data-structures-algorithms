package org.milan.datastructure.array;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SumClosestToZero}
 *
 * @author Milan Rathod
 */
class SumClosestToZeroTest {

    @Test
    void testFind() {
        int[] inputArray = new int[]{1, 60, -10, 70, -80, 85};

        SumClosestToZero sumClosestToZero = new SumClosestToZero();

        Pair<Integer, Integer> result = sumClosestToZero.find(inputArray);

        assertEquals(-80, result.getLeft().intValue());
        assertEquals(85, result.getRight().intValue());
    }
}