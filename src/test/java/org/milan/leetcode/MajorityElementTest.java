package org.milan.leetcode;

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
        assertEquals(1, majorityElement.find(new int[]{1, 1, 2, 1, 3, 1, 5}));

        assertEquals(3, majorityElement.find(new int[]{3, 2, 3}));

        assertEquals(2, majorityElement.find(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    @Test
    void testFind_NotExists() {
        assertEquals(-1, majorityElement.find(new int[]{1, 3, 3, 1, 2}));
    }

    @Test
    void testFindV2_Exists() {
        assertEquals(1, majorityElement.findV2(new int[]{1, 1, 2, 1, 3, 1, 5}));

        assertEquals(3, majorityElement.find(new int[]{3, 2, 3}));

        assertEquals(2, majorityElement.find(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    @Test
    void testFindV2_NotExists() {
        assertEquals(-1, majorityElement.findV2(new int[]{1, 3, 3, 1, 2}));
    }
}