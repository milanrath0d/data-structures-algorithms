package org.milan.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link PascalTriangle}
 *
 * @author Milan Rathod
 */
class PascalTriangleTest {

    @Test
    void generate() {
        PascalTriangle pascalTriangle = new PascalTriangle();

        List<List<Integer>> result = pascalTriangle.generate(5);

        assertEquals("[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]", result.toString());

        result = pascalTriangle.generate(1);

        assertEquals("[[1]]", result.toString());
    }
}