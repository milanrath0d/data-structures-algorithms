package org.milan.datastructure.array;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SumPairsInRotatedArray}
 *
 * @author Milan Rathod
 */
class SumPairsInRotatedArrayTest {

    private SumPairsInRotatedArray sumPairsInRotatedArray;

    @BeforeEach
    void setUp() {
        sumPairsInRotatedArray = new SumPairsInRotatedArray();
    }

    @Test
    void testGetAll() {
        int[] inputArray = new int[]{11, 5, 6, 7, 9, 10};

        List<Pair<Integer, Integer>> result = sumPairsInRotatedArray.getAll(inputArray, 15);

        assertEquals(2, result.size());
    }

    @Test
    void testGetAllV2_Exists() {
        int[] inputArray = new int[]{11, 19, 2, 7, 9, 10};
        List<Pair<Integer, Integer>> result = sumPairsInRotatedArray.getAll(inputArray);

        assertEquals(1, result.size());
    }

    @Test
    void testGetAllV2_NotExists() {
        int[] inputArray = new int[]{11, 20, 2, 7, 9, 10};
        List<Pair<Integer, Integer>> result = sumPairsInRotatedArray.getAll(inputArray);

        assertEquals(0, result.size());
    }
}