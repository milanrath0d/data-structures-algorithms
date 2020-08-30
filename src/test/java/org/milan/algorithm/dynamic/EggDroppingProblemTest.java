package org.milan.algorithm.dynamic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Milan Rathod
 */
public class EggDroppingProblemTest {

    @Test
    public void testMinimumTrialsRecursive() {
        EggDroppingProblem eggDroppingProblem = new EggDroppingProblem();

        int result = eggDroppingProblem.minimumTrialsRecursive(2, 10);

        Assert.assertEquals(4, result);
    }

    @Test
    public void testMinimumTrials() {
        EggDroppingProblem eggDroppingProblem = new EggDroppingProblem();

        int result = eggDroppingProblem.minimumTrials(2, 10);

        Assert.assertEquals(4, result);
    }
}