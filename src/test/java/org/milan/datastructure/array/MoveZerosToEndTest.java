package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Test class for {@link MoveZerosToEnd}
 *
 * @author Milan Rathod
 */
class MoveZerosToEndTest {

    @Test
    void testMove() {
        int[] testArray = new int[]{1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0};

        MoveZerosToEnd moveZerosToEnd = new MoveZerosToEnd();

        moveZerosToEnd.move(testArray);

        assertArrayEquals(new int[]{1, 9, 8, 4, 2, 7, 6, 0, 0, 0, 0}, testArray);

        testArray = new int[]{1, 2, 0, 4, 3, 0, 5, 0};

        moveZerosToEnd.move(testArray);

        assertArrayEquals(new int[]{1, 2, 4, 3, 5, 0, 0, 0}, testArray);

        testArray = new int[]{1, 2, 0, 0, 0, 3, 6};

        moveZerosToEnd.move(testArray);

        assertArrayEquals(new int[]{1, 2, 3, 6, 0, 0, 0}, testArray);
    }
}