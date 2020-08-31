package org.milan.datastructure.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link TransitiveClosure}
 *
 * @author Milan Rathod
 */
class TransitiveClosureTest {

    @Test
    void testTransitiveClosure() {
        Graph graph = new Graph(4);

        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 2);
        graph.addEdge(graph, 1, 2);
        graph.addEdge(graph, 2, 0);
        graph.addEdge(graph, 2, 3);
        graph.addEdge(graph, 3, 3);

        TransitiveClosure transitiveClosure = new TransitiveClosure(graph);

        int[][] result = transitiveClosure.transitiveClosure();

        assertEquals(1, result[0][0]);
        assertEquals(0, result[3][0]);
    }
}