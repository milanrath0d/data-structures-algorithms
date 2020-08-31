package org.milan.codechef;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link MagicArrays}
 *
 * @author Milan Rathod
 */
class MagicArraysTest {

    @Test
    void testGetMaxQualityDishes() {
        MagicArrays magicArrays = new MagicArrays();

        List<List<Integer>> input = new ArrayList<>();

        input.add(List.of(1, 2, 3));
        input.add(List.of(3, 2));
        input.add(List.of(4, 5));

        long result = magicArrays.getMaxQualityDishes(input);

        assertEquals(8, result);
    }
}