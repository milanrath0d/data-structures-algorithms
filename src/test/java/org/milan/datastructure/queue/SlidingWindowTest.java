package org.milan.datastructure.queue;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Test class for {@link org.milan.datastructure.queue.SlidingWindow}
 *
 * @author Milan Rathod
 */
public class SlidingWindowTest {

    private int[] input;

    private SlidingWindow slidingWindow;

    @Before
    public void setup() {
        input = new int[]{1, 2, 3, 1, 4, 5, 2, 3, 6};

        slidingWindow = new SlidingWindow();
    }

    @Test
    public void testGetAllMax() {
        List<Integer> result = slidingWindow.getAllMax(input, 3);

        Assert.assertEquals(result, List.of(3, 3, 4, 5, 5, 5, 6));
    }
}