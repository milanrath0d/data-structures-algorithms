package org.milan.datastructure.stack;

import org.junit.jupiter.api.Test;
import org.milan.exception.StackUnderflowError;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test Class for {@link ThreeStacksWithOneArray}
 *
 * @author Milan Rathod
 */
class ThreeStacksWithOneArrayTest {

    @Test
    void testPushOperations() {
        ThreeStacksWithOneArray threeStacksWithOneArray = new ThreeStacksWithOneArray(9);

        assertAll("Before push operations all stacks should be empty",
                () -> assertTrue(threeStacksWithOneArray.isEmpty(1)),
                () -> assertTrue(threeStacksWithOneArray.isEmpty(2)),
                () -> assertTrue(threeStacksWithOneArray.isEmpty(3)));

        threeStacksWithOneArray.push(1, 10);
        threeStacksWithOneArray.push(2, 40);
        threeStacksWithOneArray.push(3, 70);

        assertAll("After push operations all stacks should be non-empty",
                () -> assertFalse(threeStacksWithOneArray.isEmpty(1)),
                () -> assertFalse(threeStacksWithOneArray.isEmpty(2)),
                () -> assertFalse(threeStacksWithOneArray.isEmpty(3)));
    }

    @Test
    void testPopOperations() {
        ThreeStacksWithOneArray threeStacksWithOneArray = new ThreeStacksWithOneArray(9);

        threeStacksWithOneArray.push(1, 10);
        threeStacksWithOneArray.push(2, 40);
        threeStacksWithOneArray.push(3, 70);

        assertAll("After push operations all stacks should be non-empty",
                () -> assertFalse(threeStacksWithOneArray.isEmpty(1)),
                () -> assertFalse(threeStacksWithOneArray.isEmpty(2)),
                () -> assertFalse(threeStacksWithOneArray.isEmpty(3)));

        assertAll("Perform pop operations on all stacks",
                () -> assertEquals(10, threeStacksWithOneArray.pop(1)),
                () -> assertEquals(40, threeStacksWithOneArray.pop(2)),
                () -> assertEquals(70, threeStacksWithOneArray.pop(3)));

        assertAll("After pop operations all stacks should be empty",
                () -> assertTrue(threeStacksWithOneArray.isEmpty(1)),
                () -> assertTrue(threeStacksWithOneArray.isEmpty(2)),
                () -> assertTrue(threeStacksWithOneArray.isEmpty(3)));
    }

    @Test
    void testStackOverflowError() {
        ThreeStacksWithOneArray threeStacksWithOneArray = new ThreeStacksWithOneArray(3);

        assertAll("Initially all stacks should be empty",
                () -> assertTrue(threeStacksWithOneArray.isEmpty(1)),
                () -> assertTrue(threeStacksWithOneArray.isEmpty(2)),
                () -> assertTrue(threeStacksWithOneArray.isEmpty(3)));

        threeStacksWithOneArray.push(1, 10);
        threeStacksWithOneArray.push(2, 20);
        threeStacksWithOneArray.push(3, 30);

        assertAll("After push operations all stacks should be non-empty",
                () -> assertFalse(threeStacksWithOneArray.isEmpty(1)),
                () -> assertFalse(threeStacksWithOneArray.isEmpty(2)),
                () -> assertFalse(threeStacksWithOneArray.isEmpty(3)));

        assertThrows(StackOverflowError.class, () -> threeStacksWithOneArray.push(3, 40));
    }

    @Test
    void testStackUnderflowError() {
        ThreeStacksWithOneArray threeStacksWithOneArray = new ThreeStacksWithOneArray(9);

        assertAll("Initially all stacks should be empty",
                () -> assertTrue(threeStacksWithOneArray.isEmpty(1)),
                () -> assertTrue(threeStacksWithOneArray.isEmpty(2)),
                () -> assertTrue(threeStacksWithOneArray.isEmpty(3)));

        assertThrows(StackUnderflowError.class, () -> threeStacksWithOneArray.pop(1));
    }
}