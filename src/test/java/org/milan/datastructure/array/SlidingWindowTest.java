package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link SlidingWindow}
 *
 * @author Milan Rathod
 */
class SlidingWindowTest {

    private int[] input;

    private SlidingWindow slidingWindow;

    @BeforeEach
    void setup() {
        input = new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6};

        slidingWindow = new SlidingWindow();
    }

    @Test
    void testGetAllMax() {
        List<Integer> result = slidingWindow.getAllMax(input, 3);

        assertEquals(result, List.of(3, 3, 4, 5, 5, 5, 6));
    }
}