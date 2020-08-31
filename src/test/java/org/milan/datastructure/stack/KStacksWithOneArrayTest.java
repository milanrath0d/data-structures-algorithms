package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link KStacksWithOneArray}
 *
 * @author Milan Rathod
 */
class KStacksWithOneArrayTest {

    @Test
    void testPushPopOperations() {
        KStacksWithOneArray kStacksWithOneArray = new KStacksWithOneArray(6, 3);

        assertTrue(kStacksWithOneArray.isEmpty(0));
        assertTrue(kStacksWithOneArray.isEmpty(1));
        assertTrue(kStacksWithOneArray.isEmpty(2));

        kStacksWithOneArray.push(0, 10);
        kStacksWithOneArray.push(1, 20);
        kStacksWithOneArray.push(0, 30);
        kStacksWithOneArray.push(0, 40);
        kStacksWithOneArray.push(2, 50);
        kStacksWithOneArray.push(1, 60);

        assertEquals(40, kStacksWithOneArray.pop(0));
        assertEquals(60, kStacksWithOneArray.pop(1));
        assertEquals(50, kStacksWithOneArray.pop(2));

    }
}