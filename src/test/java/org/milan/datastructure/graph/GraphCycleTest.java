package org.milan.datastructure.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link GraphCycle}
 *
 * @author Milan Rathod
 */
class GraphCycleTest {

    @Test
    void TestIsCycleExists() {
        Graph graph = new Graph(4);
        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 2);
        graph.addEdge(graph, 1, 2);
        graph.addEdge(graph, 2, 0);
        graph.addEdge(graph, 2, 3);

        GraphCycle graphCycle = new GraphCycle(graph);

        assertTrue(graphCycle.isCycleExists());
    }
}