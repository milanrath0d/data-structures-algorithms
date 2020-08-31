package org.milan.datastructure.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link TrappingWaterProblem}
 *
 * @author Milan Rathod
 */
class TrappingWaterProblemTest {

    private TrappingWaterProblem trappingWaterProblem;

    private int[] input1;

    private int[] input2;

    private int[] input3;

    @BeforeEach
    void setUp() {
        trappingWaterProblem = new TrappingWaterProblem();
        input1 = new int[]{2, 0, 2};
        input2 = new int[]{3, 0, 0, 2, 0, 4};
        input3 = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    }

    @Test
    void testMaxWater() {
        assertEquals(2, trappingWaterProblem.maxWater(input1));

        assertEquals(10, trappingWaterProblem.maxWater(input2));

        assertEquals(6, trappingWaterProblem.maxWater(input3));
    }

    @Test
    void testMaxWaterV2() {
        assertEquals(2, trappingWaterProblem.maxWaterV2(input1));

        assertEquals(10, trappingWaterProblem.maxWaterV2(input2));

        assertEquals(6, trappingWaterProblem.maxWaterV2(input3));
    }

    @Test
    void testMaxWaterV3() {
        assertEquals(2, trappingWaterProblem.maxWaterV3(input1));

        assertEquals(10, trappingWaterProblem.maxWaterV3(input2));

        assertEquals(6, trappingWaterProblem.maxWaterV3(input3));
    }
}