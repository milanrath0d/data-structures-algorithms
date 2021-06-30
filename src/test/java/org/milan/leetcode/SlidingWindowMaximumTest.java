package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link SlidingWindowMaximum}
 *
 * @author Milan Rathod
 */
class SlidingWindowMaximumTest {

    @Test
    void maxSlidingWindow() {
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();

        assertArrayEquals(new int[]{3, 3, 4, 5, 5, 5, 6}, slidingWindowMaximum.maxSlidingWindow(
                new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6}, 3));

        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, slidingWindowMaximum.maxSlidingWindow(
                new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));

        assertArrayEquals(new int[]{1}, slidingWindowMaximum.maxSlidingWindow(
                new int[]{1}, 1));

        assertArrayEquals(new int[]{1, -1}, slidingWindowMaximum.maxSlidingWindow(
                new int[]{1, -1}, 1));

        assertArrayEquals(new int[]{11}, slidingWindowMaximum.maxSlidingWindow(
                new int[]{9, 11}, 2));
    }

    @Test
    void maxSlidingWindowV2() {
        SlidingWindowMaximum slidingWindowMaximum = new SlidingWindowMaximum();

        assertArrayEquals(new int[]{3, 3, 4, 5, 5, 5, 6}, slidingWindowMaximum.maxSlidingWindowV2(
                new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6}, 3));

        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, slidingWindowMaximum.maxSlidingWindowV2(
                new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));

        assertArrayEquals(new int[]{1}, slidingWindowMaximum.maxSlidingWindowV2(
                new int[]{1}, 1));

        assertArrayEquals(new int[]{1, -1}, slidingWindowMaximum.maxSlidingWindowV2(
                new int[]{1, -1}, 1));

        assertArrayEquals(new int[]{11}, slidingWindowMaximum.maxSlidingWindowV2(
                new int[]{9, 11}, 2));
    }
}