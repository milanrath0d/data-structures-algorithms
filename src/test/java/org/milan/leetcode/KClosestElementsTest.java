package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link KClosestElements}
 *
 * @author Milan Rathod
 */
class KClosestElementsTest {

    @Test
    void findClosestElements() {
        KClosestElements kClosestElements = new KClosestElements();

        assertEquals(List.of(1, 2, 3, 4), kClosestElements.findClosestElements(new int[]{1, 2, 3, 4, 5}, 4, 3));

        assertEquals(List.of(-5, -3, -2),
                kClosestElements.findClosestElements(new int[]{-10, -5, -3, -2, 0, 1, 2}, 3, -3));
    }

    @Test
    void findClosestElementsV2() {
        KClosestElements kClosestElements = new KClosestElements();

        assertEquals(List.of(1, 2, 3, 4), kClosestElements.findClosestElementsV2(new int[]{1, 2, 3, 4, 5}, 4, 3));

        assertEquals(List.of(-5, -3, -2),
                kClosestElements.findClosestElementsV2(new int[]{-10, -5, -3, -2, 0, 1, 2}, 3, -3));
    }
}