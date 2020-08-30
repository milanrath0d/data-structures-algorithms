package org.milan.datastructure.graph;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class VisitedNodesTest {

    @Test
    public void find() {
        VisitedNodes visitedNodes = new VisitedNodes();

        int N = 6;
        int M = 8;
        int[] priorities = new int[]{0,2, 2, 4, 5, 2, 6};
        int[][] edges = {{0, 1, 7}, {0, 2, 5}, {2, 6, 6},
                {2, 3, 5}, {3, 4, 6}, {6, 3, 3}, {1, 6, 2}, {1, 5, 6}};

        int[] result = visitedNodes.find(N, M, priorities, edges);

        Assert.assertArrayEquals(new int[]{31, 5, 14, 20, 37, 11}, result);
    }
}