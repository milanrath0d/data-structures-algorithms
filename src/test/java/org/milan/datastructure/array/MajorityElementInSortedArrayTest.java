package org.milan.datastructure.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MajorityElementInSortedArrayTest {

    private MajorityElementInSortedArray majorityElementInSortedArray;

    @Before
    public void init() {
        majorityElementInSortedArray = new MajorityElementInSortedArray();
    }

    @Test
    public void testIsMajority() {
        int[] arr = {1, 2, 3, 4, 4, 4, 4};

        boolean result = majorityElementInSortedArray.isMajority(arr, 4);

        Assert.assertTrue(result);

        arr = new int[]{1, 3, 4, 4, 5, 5};

        result = majorityElementInSortedArray.isMajority(arr, 4);

        Assert.assertFalse(result);
    }

    @Test
    public void testIsMajorityV2() {
        int[] arr = {1, 2, 3, 4, 4, 4, 4};

        boolean result = majorityElementInSortedArray.isMajorityV2(arr, 4);

        Assert.assertTrue(result);

        arr = new int[]{1, 3, 4, 4, 5, 5};

        result = majorityElementInSortedArray.isMajorityV2(arr, 4);

        Assert.assertFalse(result);
    }
}