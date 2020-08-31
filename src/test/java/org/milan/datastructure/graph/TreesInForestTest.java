package org.milan.datastructure.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link TreesInForest}
 *
 * @author Milan Rathod
 */
class TreesInForestTest {

    @Test
    void totalTrees() {
        Graph graph = new Graph(5);
        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 2);
        graph.addEdge(graph, 3, 4);

        TreesInForest treesInForest = new TreesInForest(graph);

        assertEquals(2, treesInForest.totalTrees());
    }
}