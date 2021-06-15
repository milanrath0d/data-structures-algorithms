package org.milan.codechef;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link TotalDiamonds}
 *
 * @author Milan Rathod
 */
class TotalDiamondsTest {

    @Test
    void getTotal() {
        TotalDiamonds totalDiamonds = new TotalDiamonds();

        assertEquals(2, totalDiamonds.getTotal(1));
        assertEquals(12, totalDiamonds.getTotal(2));
        assertEquals(36, totalDiamonds.getTotal(3));
    }
}