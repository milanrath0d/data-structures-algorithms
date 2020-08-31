package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MajorityElement}
 *
 * @author Milan Rathod
 */
class MajorityElementTest {

    private MajorityElement majorityElement;

    @BeforeEach
    void setup() {
        majorityElement = new MajorityElement();
    }

    @Test
    void testFind_Exists() {
        int[] arr = new int[]{1, 1, 2, 1, 3, 1, 5};

        int result = majorityElement.find(arr);

        assertEquals(1, result);
    }

    @Test
    void testFind_NotExists() {
        int[] arr = new int[]{1, 3, 3, 1, 2};

        int result = majorityElement.find(arr);

        assertEquals(-1, result);
    }

    @Test
    void testFindV2_Exists() {
        int[] arr = new int[]{1, 1, 2, 1, 3, 1, 5};

        int result = majorityElement.findV2(arr);

        assertEquals(1, result);
    }

    @Test
    void testFindV2_NotExists() {
        int[] arr = new int[]{1, 3, 3, 1, 2};

        int result = majorityElement.findV2(arr);

        assertEquals(-1, result);
    }
}