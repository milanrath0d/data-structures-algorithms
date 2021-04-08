package org.milan.algorithm.sorting;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link BucketSort}
 *
 * @author Milan Rathod
 */
class BucketSortTest {

    @Test
    void testSort() {
        float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};

        BucketSort bucketSort = new BucketSort();

        bucketSort.sort(arr);

        assertArrayEquals(new float[]{0.1234f, 0.3434f, 0.565f, 0.656f, 0.665f, 0.897f}, arr);
    }

    @Test
    void testSortAll() {
        float[] arr = {-0.897f, 0.565f, 0.656f, -0.1234f, 0, 0.3434f};

        BucketSort bucketSort = new BucketSort();

        bucketSort.sortAll(arr);

        assertArrayEquals(new float[]{-0.897f, -0.1234f, 0f, 0.3434f, 0.565f, 0.656f}, arr);
    }
}