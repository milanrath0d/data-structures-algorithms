package org.milan.datastructure.misc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link Josephus}
 *
 * @author Milan Rathod
 */
class JosephusTest {

    @Test
    void testLuckyPerson() {
        Josephus josephus = new Josephus();

        assertEquals(4, josephus.luckyPerson(7, 3));
    }
}