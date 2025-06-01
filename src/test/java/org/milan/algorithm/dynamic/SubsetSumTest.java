package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link SubsetSum}
 *
 * @author Milan Rathod
 */
class SubsetSumTest {

    private SubsetSum subsetSum;

    @BeforeEach
    void setUp() {
        subsetSum = new SubsetSum();
    }

    @Test
    @DisplayName("Test with sum=9")
    void testIsSubsetSum() {
        int[] arr = {3, 34, 4, 12, 5, 2};
        assertTrue(subsetSum.isSubsetSum(arr, arr.length, 9));
        assertTrue(subsetSum.isSubsetSumV2(arr, arr.length, 9));
        assertTrue(subsetSum.isSubsetSumV3(arr, arr.length, 9));
        assertTrue(subsetSum.isSubsetSumV4(arr, arr.length, 9));
    }

    @ParameterizedTest(name = "{index}: arr={0}, sum={1}, expected={2}")
    @MethodSource("subsetSumTestCases")
    @DisplayName("Test all approaches with various test cases")
    void testAllApproaches(int[] arr, int sum, boolean expected) {
        // Test all four implementations with the same input data
        if (expected) {
            assertTrue(subsetSum.isSubsetSum(arr, arr.length, sum),
                "Recursive approach failed for sum=" + sum);
            assertTrue(subsetSum.isSubsetSumV2(arr, arr.length, sum),
                "DP approach (V2) failed for sum=" + sum);
            assertTrue(subsetSum.isSubsetSumV3(arr, arr.length, sum),
                "DP approach (V2) failed for sum=" + sum);
            assertTrue(subsetSum.isSubsetSumV4(arr, arr.length, sum),
                "Space-optimized DP approach (V4) failed for sum=" + sum);
        } else {
            assertFalse(subsetSum.isSubsetSum(arr, arr.length, sum),
                "Recursive approach failed for sum=" + sum);
            assertFalse(subsetSum.isSubsetSumV2(arr, arr.length, sum),
                "DP approach (V2) failed for sum=" + sum);
            assertFalse(subsetSum.isSubsetSumV3(arr, arr.length, sum),
                "DP approach (V2) failed for sum=" + sum);
            assertFalse(subsetSum.isSubsetSumV4(arr, arr.length, sum),
                "Space-optimized DP approach (V4) failed for sum=" + sum);
        }
    }

    static Stream<Arguments> subsetSumTestCases() {
        return Stream.of(
            // GeeksForGeeks examples
            Arguments.of(new int[]{3, 34, 4, 12, 5, 2}, 9, true),   // {4, 5} = 9
            Arguments.of(new int[]{3, 34, 4, 12, 5, 2}, 30, false), // No subset with sum 30

            // Edge cases
            Arguments.of(new int[]{}, 0, true),              // Empty array, sum 0 (empty subset)
            Arguments.of(new int[]{}, 5, false),             // Empty array, non-zero sum
            Arguments.of(new int[]{5}, 5, true),             // Single element equal to sum
            Arguments.of(new int[]{5}, 4, false),            // Single element not equal to sum
            Arguments.of(new int[]{0}, 0, true),             // Zero element, zero sum

            // Special cases
            Arguments.of(new int[]{1, 2, 3, 4, 5}, 15, true),        // All elements = sum
            Arguments.of(new int[]{1, 2, 3, 4, 5}, 7, true),         // Multiple valid subsets
            Arguments.of(new int[]{1, 5, 11, 5}, 11, true),          // Single element equals sum
            Arguments.of(new int[]{1, 3, 5, 7}, 12, true),           // Multiple element combination
            Arguments.of(new int[]{2, 4, 6, 8}, 11, false),          // No valid subset
            Arguments.of(new int[]{1, 1, 1, 1, 1}, 3, true),         // Repeated elements

            // Examples from GFG article
            Arguments.of(new int[]{1, 5, 3, 7, 4}, 12, true),        // {1, 7, 4} or {5, 7} or {5, 3, 4}

            // Large values
            Arguments.of(new int[]{42, 68, 35, 1, 70, 25, 79, 59, 63, 65}, 347, true),
            Arguments.of(new int[]{20, 303, 3, 4, 25}, 49, true),
            Arguments.of(new int[]{100, 200, 300, 400}, 1500, false)
        );
    }

    @Test
    @DisplayName("Test recursive approach with zero sum")
    void testZeroSum() {
        int[] arr = {3, 34, 4, 12, 5, 2};
        // Zero sum is always possible (empty subset)
        assertTrue(subsetSum.isSubsetSum(arr, arr.length, 0));
        assertTrue(subsetSum.isSubsetSumV2(arr, arr.length, 0));
        assertTrue(subsetSum.isSubsetSumV3(arr, arr.length, 0));
        assertTrue(subsetSum.isSubsetSumV4(arr, arr.length, 0));
    }

    @Test
    @DisplayName("Test with only one matching element")
    void testSingleMatchingElement() {
        int[] arr = {3, 34, 4, 12, 5, 2};
        // Sum 34 is possible with just one element
        assertTrue(subsetSum.isSubsetSum(arr, arr.length, 34));
        assertTrue(subsetSum.isSubsetSumV2(arr, arr.length, 34));
        assertTrue(subsetSum.isSubsetSumV3(arr, arr.length, 34));
        assertTrue(subsetSum.isSubsetSumV4(arr, arr.length, 34));
    }

    @Test
    @DisplayName("Test impossible sum (greater than all elements combined)")
    void testImpossibleSum() {
        int[] arr = {3, 34, 4, 12, 5, 2};
        int sum = 3 + 34 + 4 + 12 + 5 + 2 + 1; // Sum of all elements + 1
        assertFalse(subsetSum.isSubsetSum(arr, arr.length, sum));
        assertFalse(subsetSum.isSubsetSumV2(arr, arr.length, sum));
        assertFalse(subsetSum.isSubsetSumV3(arr, arr.length, sum));
        assertFalse(subsetSum.isSubsetSumV4(arr, arr.length, sum));
    }
}