package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link SubsetSum}
 *
 * @author Milan Rathod
 */
class SubsetSumTest {

    private SubsetSum subsetSum;

    private int[] arr;

    @BeforeEach
    void setUp() {
        subsetSum = new SubsetSum();

        arr = new int[]{3, 34, 4, 12, 5, 2};
    }

    @Test
    void testIsSubsetSum() {
        assertTrue(subsetSum.isSubsetSum(arr, arr.length, 9));
    }

    @Test
    void testIsSubsetSumV2() {
        assertTrue(subsetSum.isSubsetSumV2(arr, arr.length, 9));
    }

    @Test
    void testIsSubsetSumV3() {
        assertTrue(subsetSum.isSubsetSumV3(arr, arr.length, 9));
    }

    @Test
    void testPrintSubsetSum() {
        subsetSum.printSubsetSum(new int[]{2, 3, 5, 6, 8, 10}, 6, 10);
    }
}