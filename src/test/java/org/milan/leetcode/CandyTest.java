package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Candy}
 *
 * @author Milan Rathod
 */
class CandyTest {

    @Test
    void candy() {
        Candy candy = new Candy();

        assertEquals(5, candy.candy(new int[]{1, 0, 2}));

        assertEquals(4, candy.candy(new int[]{1, 2, 2}));

        assertEquals(23, candy.candy(new int[]{5, 6, 2, 2, 4, 8, 9, 5, 4, 0, 5, 1}));
    }
}