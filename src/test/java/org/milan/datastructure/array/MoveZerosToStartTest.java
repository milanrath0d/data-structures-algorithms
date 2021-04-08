package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link MoveZerosToStart}
 *
 * @author Milan Rathod
 */
class MoveZerosToStartTest {

    @Test
    void testMove() {
        int[] testArray = new int[]{1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

        MoveZerosToStart moveZerosToStart = new MoveZerosToStart();

        moveZerosToStart.move(testArray);

        assertArrayEquals(new int[]{0, 0, 0, 0, 1, 9, 8, 4, 2, 7, 6}, testArray);

        testArray = new int[]{1, 2, 0, 4, 3, 0, 5, 0};

        moveZerosToStart.move(testArray);

        assertArrayEquals(new int[]{0, 0, 0, 1, 2, 4, 3, 5}, testArray);

        testArray = new int[]{1, 2, 0, 0, 0, 3, 6};

        moveZerosToStart.move(testArray);

        assertArrayEquals(new int[]{0, 0, 0, 1, 2, 3, 6}, testArray);
    }
}