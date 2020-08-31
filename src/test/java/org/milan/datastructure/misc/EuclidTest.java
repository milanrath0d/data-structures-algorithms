package org.milan.datastructure.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Euclid}
 *
 * @author Milan Rathod
 */
class EuclidTest {

    @Test
    void testGcd() {
        Euclid euclid = new Euclid();

        int result = euclid.gcd(5, 1);

        assertEquals(1, result);
    }
}