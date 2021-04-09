package org.milan.datastructure.array;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link SumPairs}
 *
 * @author Milan Rathod
 */
class SumPairsTest {

    private SumPairs sumPairs;

    @BeforeEach
    void setup() {
        sumPairs = new SumPairs();
    }

    @Test
    void testGetAll() {
        int[] inputArray = new int[]{1, 5, 7, -1, 5};

        List<Pair<Integer, Integer>> result = sumPairs.getAllPairs(inputArray, 6);

        assertEquals(3, result.size());
    }

    @Test
    void testGetAllV2_Exists() {
        int[] inputArray = new int[]{2, 11, 5, 1, 4, 7};

        assertTrue(sumPairs.checkPair(inputArray));
    }

    @Test
    void testGetAllV2_NotExists() {
        int[] inputArray = new int[]{2, 4, 2, 1, 11, 15};

        assertFalse(sumPairs.checkPair(inputArray));
    }
}