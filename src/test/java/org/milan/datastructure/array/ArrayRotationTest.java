package org.milan.datastructure.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class ArrayRotationTest {

    @Test
    void testRotate() {
        ArrayRotation arrayRotation = new ArrayRotation();

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};

        arrayRotation.rotate(arr, 2);

        assertArrayEquals(new int[]{3, 4, 5, 6, 7, 1, 2}, arr);
    }

    @Test
    void testRotateV2() {
        ArrayRotation arrayRotation = new ArrayRotation();

        int[] arr = new int[]{1, 2, 3, 4, 5, 6};

        arrayRotation.rotateV2(arr, 2);

        assertArrayEquals(new int[]{3, 4, 5, 6, 1, 2}, arr);
    }
}