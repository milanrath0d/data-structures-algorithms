package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link MajorityElementInSortedArray}
 *
 * @author Milan Rathod
 */
class MajorityElementInSortedArrayTest {

    private MajorityElementInSortedArray majorityElementInSortedArray;

    @BeforeEach
    void init() {
        majorityElementInSortedArray = new MajorityElementInSortedArray();
    }

    @Test
    void testIsMajority() {
        int[] arr = {1, 2, 3, 4, 4, 4, 4};

        boolean result = majorityElementInSortedArray.isMajority(arr, 4);

        assertTrue(result);

        arr = new int[]{1, 3, 4, 4, 5, 5};

        result = majorityElementInSortedArray.isMajority(arr, 4);

        assertFalse(result);
    }

    @Test
    void testIsMajorityV2() {
        int[] arr = {1, 2, 3, 4, 4, 4, 4};

        boolean result = majorityElementInSortedArray.isMajorityV2(arr, 4);

        assertTrue(result);

        arr = new int[]{1, 3, 4, 4, 5, 5};

        result = majorityElementInSortedArray.isMajorityV2(arr, 4);

        assertFalse(result);
    }
}