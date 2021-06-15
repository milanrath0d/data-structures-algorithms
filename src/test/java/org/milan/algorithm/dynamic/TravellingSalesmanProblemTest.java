package org.milan.algorithm.dynamic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.milan.datastructure.tree.TreeDataUtil;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test class for {@link TravellingSalesmanProblem}
 *
 * @author Milan Rathod
 */
class TravellingSalesmanProblemTest {

    private double[][] distanceMatrix;

    private TravellingSalesmanProblem travellingSalesmanProblem;

    @BeforeEach
    void setup() {
        int n = 4;
        distanceMatrix = new double[n][n];
        distanceMatrix[0][1] = distanceMatrix[1][0] = 10;
        distanceMatrix[0][2] = distanceMatrix[2][0] = 15;
        distanceMatrix[0][3] = distanceMatrix[3][0] = 20;
        distanceMatrix[1][2] = distanceMatrix[2][1] = 35;
        distanceMatrix[1][3] = distanceMatrix[3][1] = 25;
        distanceMatrix[2][3] = distanceMatrix[3][2] = 30;
        travellingSalesmanProblem = new TravellingSalesmanProblem(distanceMatrix);
    }

    @Test
    void getTour() {
        assertEquals(80, travellingSalesmanProblem.getTourCost());
    }

    @Test
    void getTourCost() {
        assertArrayEquals(new int[]{0, 1, 3, 2, 0}, TreeDataUtil.toArray(travellingSalesmanProblem.getTour()));
    }
}