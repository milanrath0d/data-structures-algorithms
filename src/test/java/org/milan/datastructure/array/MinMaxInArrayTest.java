package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MinMaxInArray}
 *
 * @author Milan Rathod
 */
class MinMaxInArrayTest {

    @Test
    void testFindMinMax() {
        MinMaxInArray minMaxInArray = new MinMaxInArray();

        int[] inputArray = {10, 11, 45, 2, 33, 30, 7};
        List<Integer> result = minMaxInArray.findMinMax(inputArray);

        assertEquals(2, result.get(0).intValue());
        assertEquals(45, result.get(1).intValue());
    }

    @Test
    void testFindMinMax1() {
        MinMaxInArray minMaxInArray = new MinMaxInArray();

        int[] inputArray = {10, 11, 45, 2, 33, 30, 7};
        List<Integer> result = minMaxInArray.findMinMax(inputArray, 0, inputArray.length - 1);

        assertEquals(2, result.get(0).intValue());
        assertEquals(45, result.get(1).intValue());
    }

    @Test
    void testFindMinMax2() {
        MinMaxInArray minMaxInArray = new MinMaxInArray();

        int[] inputArray = {10, 11, 45, 2, 33, 30, 7};
        List<Integer> result = minMaxInArray.findMinMax(inputArray, inputArray.length);

        assertEquals(2, result.get(0).intValue());
        assertEquals(45, result.get(1).intValue());
    }
}