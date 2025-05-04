package org.milan.leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MaxConsecutiveOnesAfterFlippingZeroes}
 * 
 * @author Milan Rathod
 */
public class MaxConsecutiveOnesAfterFlippingZeroesTest {

    @Test
    public void testLongestOnes_Example1() {
        MaxConsecutiveOnesAfterFlippingZeroes solution = new MaxConsecutiveOnesAfterFlippingZeroes();
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        assertEquals(6, solution.longestOnes(nums, k));
    }

    @Test
    public void testLongestOnes_Example2() {
        MaxConsecutiveOnesAfterFlippingZeroes solution = new MaxConsecutiveOnesAfterFlippingZeroes();
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        assertEquals(10, solution.longestOnes(nums, k));
    }

    @Test
    public void testLongestOnes_AllOnes() {
        MaxConsecutiveOnesAfterFlippingZeroes solution = new MaxConsecutiveOnesAfterFlippingZeroes();
        int[] nums = {1, 1, 1, 1, 1};
        int k = 0;
        assertEquals(5, solution.longestOnes(nums, k));
    }

    @Test
    public void testLongestOnes_AllZeroes() {
        MaxConsecutiveOnesAfterFlippingZeroes solution = new MaxConsecutiveOnesAfterFlippingZeroes();
        int[] nums = {0, 0, 0, 0, 0};
        int k = 2;
        assertEquals(2, solution.longestOnes(nums, k));
    }

    @Test
    public void testLongestOnes_KEqualsArrayLength() {
        MaxConsecutiveOnesAfterFlippingZeroes solution = new MaxConsecutiveOnesAfterFlippingZeroes();
        int[] nums = {0, 0, 0, 1, 0};
        int k = 5;
        assertEquals(5, solution.longestOnes(nums, k));
    }

    @Test
    public void testLongestOnes_KGreaterThanZeroCount() {
        MaxConsecutiveOnesAfterFlippingZeroes solution = new MaxConsecutiveOnesAfterFlippingZeroes();
        int[] nums = {0, 1, 0, 1, 1};
        int k = 3;
        assertEquals(5, solution.longestOnes(nums, k));
    }

    @Test
    public void testLongestOnes_EmptyArray() {
        MaxConsecutiveOnesAfterFlippingZeroes solution = new MaxConsecutiveOnesAfterFlippingZeroes();
        int[] nums = {};
        int k = 2;
        assertEquals(0, solution.longestOnes(nums, k));
    }

    @Test
    public void testLongestOnes_KIsZero() {
        MaxConsecutiveOnesAfterFlippingZeroes solution = new MaxConsecutiveOnesAfterFlippingZeroes();
        int[] nums = {1, 0, 1, 1, 0, 1};
        int k = 0;
        assertEquals(2, solution.longestOnes(nums, k));
    }

    @Test
    public void testLongestOnes_AlternatingOnesAndZeroes() {
        MaxConsecutiveOnesAfterFlippingZeroes solution = new MaxConsecutiveOnesAfterFlippingZeroes();
        int[] nums = {1, 0, 1, 0, 1, 0, 1};
        int k = 1;
        assertEquals(3, solution.longestOnes(nums, k));
    }

    @Test
    public void testLongestOnes_ZeroesInMiddle() {
        MaxConsecutiveOnesAfterFlippingZeroes solution = new MaxConsecutiveOnesAfterFlippingZeroes();
        int[] nums = {1, 1, 0, 0, 0, 1, 1};
        int k = 3;
        assertEquals(7, solution.longestOnes(nums, k));
    }
} 