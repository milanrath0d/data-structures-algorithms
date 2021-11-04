package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link ValidTriangleNumber}
 *
 * @author Milan Rathod
 */
class ValidTriangleNumberTest {

    @Test
    void triangleNumber() {
        ValidTriangleNumber validTriangleNumber = new ValidTriangleNumber();

        assertEquals(3, validTriangleNumber.triangleNumber(new int[]{2, 2, 3, 4}));

        assertEquals(4, validTriangleNumber.triangleNumber(new int[]{4, 2, 3, 4}));
    }
}