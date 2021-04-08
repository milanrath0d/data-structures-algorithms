package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link EggDroppingProblem}
 *
 * @author Milan Rathod
 */
class EggDroppingProblemTest {

    @Test
    void testMinimumTrialsRecursive() {
        EggDroppingProblem eggDroppingProblem = new EggDroppingProblem();

        int result = eggDroppingProblem.minimumTrialsRecursive(2, 10);

        assertEquals(4, result);
    }

    @Test
    void testMinimumTrials() {
        EggDroppingProblem eggDroppingProblem = new EggDroppingProblem();

        int result = eggDroppingProblem.minimumTrials(2, 10);

        assertEquals(4, result);
    }
}