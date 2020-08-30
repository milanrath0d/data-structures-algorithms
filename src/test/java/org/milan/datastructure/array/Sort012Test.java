package org.milan.datastructure.array;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class Sort012Test {

    private Sort012 sort012;

    @Before
    public void init() {
        sort012 = new Sort012();
    }

    @Test
    public void sort() {
        int[] result = sort012.sort(new int[]{0, 1, 2, 0, 1, 2});

        Assert.assertArrayEquals(result, new int[]{0, 0, 1, 1, 2, 2});

        result = sort012.sort(new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1});

        Assert.assertArrayEquals(result, new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2});
    }

    @Test
    public void sortV2() {
        int[] result = sort012.sortV2(new int[]{0, 1, 2, 0, 1, 2});

        Assert.assertArrayEquals(result, new int[]{0, 0, 1, 1, 2, 2});

        result = sort012.sortV2(new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1});

        Assert.assertArrayEquals(result, new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2});
    }
}