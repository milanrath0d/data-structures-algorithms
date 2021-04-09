package org.milan.geeksforgeeks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link PainterPartitionProblem}
 *
 * @author Milan Rathod
 */
class PainterPartitionProblemTest {

    @Test
    void testPartition() {
        int[] arr = {10, 20, 60, 50, 30, 40};

        PainterPartitionProblem painterPartitionProblem = new PainterPartitionProblem();

        int result = painterPartitionProblem.partition(arr, arr.length, 3);

        assertEquals(90, result);

        arr = new int[]{10, 20, 30, 40};

        result = painterPartitionProblem.partition(arr, arr.length, 2);

        assertEquals(60, result);
    }

}