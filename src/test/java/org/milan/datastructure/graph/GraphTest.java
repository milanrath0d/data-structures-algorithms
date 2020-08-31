package org.milan.datastructure.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link Graph}
 *
 * @author Milan Rathod
 */
class GraphTest {

    @Test
    void testAddEdge() {
        Graph graph = new Graph(5);
        graph.addEdge(graph, 1, 2);

        assertEquals(2, graph.getAdjList()[1].get(0).intValue());
    }
}