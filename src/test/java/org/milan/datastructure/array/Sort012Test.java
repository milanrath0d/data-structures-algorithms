package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Sort012Test {

    private Sort012 sort012;

    @BeforeEach
    void init() {
        sort012 = new Sort012();
    }

    @Test
    void testSort() {
        int[] result = sort012.sort(new int[]{0, 1, 2, 0, 1, 2});

        assertArrayEquals(result, new int[]{0, 0, 1, 1, 2, 2});

        result = sort012.sort(new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1});

        assertArrayEquals(result, new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2});
    }

    @Test
    void testSortV2() {
        int[] result = sort012.sortV2(new int[]{0, 1, 2, 0, 1, 2});

        assertArrayEquals(result, new int[]{0, 0, 1, 1, 2, 2});

        result = sort012.sortV2(new int[]{0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1});

        assertArrayEquals(result, new int[]{0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2});
    }
}