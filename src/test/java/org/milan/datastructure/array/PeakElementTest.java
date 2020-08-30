package org.milan.datastructure.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PeakElementTest {

    private PeakElement peakElement;

    @Before
    public void init() {
        peakElement = new PeakElement();
    }

    @Test
    public void testFind() {
        int[] arr = new int[]{1, 3, 20, 4, 1, 0};
        int result = peakElement.find(arr);
        Assert.assertEquals(2, result);

        arr = new int[]{11, 3, 1, 0};
        result = peakElement.find(arr);
        Assert.assertEquals(0, result);

        arr = new int[]{1, 11};
        result = peakElement.find(arr);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testFindV2() {
        int[] arr = new int[]{1, 3, 20, 4, 1, 0};
        int result = peakElement.findV2(arr);
        Assert.assertEquals(2, result);

        arr = new int[]{2, 3, 4, 5, 12};
        result = peakElement.findV2(arr);
        Assert.assertEquals(4, result);

        arr = new int[]{1, 11};
        result = peakElement.findV2(arr);
        Assert.assertEquals(1, result);
    }
}