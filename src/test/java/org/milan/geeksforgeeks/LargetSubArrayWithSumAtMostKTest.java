package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LargetSubArrayWithSumAtMostKTest {

    @Test
    public void testFind_ExampleFromGeeksForGeeks() {
        LargetSubArrayWithSumAtMostK solution = new LargetSubArrayWithSumAtMostK();
        int[] arr = {1, 2, 1, 0, 1, 1, 0};
        int k = 4;
        assertEquals(5, solution.find(arr, k));
    }

    @Test
    public void testFind_SecondExample() {
        LargetSubArrayWithSumAtMostK solution = new LargetSubArrayWithSumAtMostK();
        int[] arr = {8, 2, 4, 0, 1, 1, 0};
        int k = 9;
        assertEquals(6, solution.find(arr, k));
    }

    @Test
    public void testFind_EmptyArray() {
        LargetSubArrayWithSumAtMostK solution = new LargetSubArrayWithSumAtMostK();
        int[] arr = {};
        int k = 5;
        assertEquals(0, solution.find(arr, k));
    }

    @Test
    public void testFind_AllElementsExceedK() {
        LargetSubArrayWithSumAtMostK solution = new LargetSubArrayWithSumAtMostK();
        int[] arr = {10, 11, 12};
        int k = 5;
        assertEquals(0, solution.find(arr, k));
    }

    @Test
    public void testFind_SingleElementExceedsK() {
        LargetSubArrayWithSumAtMostK solution = new LargetSubArrayWithSumAtMostK();
        int[] arr = {1, 2, 10, 3, 4};
        int k = 7;
        assertEquals(2, solution.find(arr, k));
    }

    @Test
    public void testFind_AllElementsEqual() {
        LargetSubArrayWithSumAtMostK solution = new LargetSubArrayWithSumAtMostK();
        int[] arr = {2, 2, 2, 2, 2};
        int k = 6;
        assertEquals(3, solution.find(arr, k));
    }

    @Test
    public void testFind_ZeroElements() {
        LargetSubArrayWithSumAtMostK solution = new LargetSubArrayWithSumAtMostK();
        int[] arr = {0, 0, 0, 0};
        int k = 1;
        assertEquals(4, solution.find(arr, k));
    }

    @Test
    public void testFind_KIsZero() {
        LargetSubArrayWithSumAtMostK solution = new LargetSubArrayWithSumAtMostK();
        int[] arr = {1, 0, 2, 0, 3};
        int k = 0;
        assertEquals(1, solution.find(arr, k));
    }
} 