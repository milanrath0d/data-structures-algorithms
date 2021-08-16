package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class for {@link IntegersWithoutConsecutiveOnes}
 *
 * @author Milan Rathod
 */
class IntegersWithoutConsecutiveOnesTest {

    @Test
    void findIntegers() {
        IntegersWithoutConsecutiveOnes integersWithoutConsecutiveOnes = new IntegersWithoutConsecutiveOnes();

        assertEquals(5, integersWithoutConsecutiveOnes.findIntegers(5));

        assertEquals(2, integersWithoutConsecutiveOnes.findIntegers(1));

        assertEquals(3, integersWithoutConsecutiveOnes.findIntegers(2));
    }
}