package org.milan.datastructure.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test Class for {@link MotherVertex}
 *
 * @author Milan Rathod
 */
class MotherVertexTest {

    @Test
    void testFind() {
        Graph graph = new Graph(7);
        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 0, 2);
        graph.addEdge(graph, 1, 3);
        graph.addEdge(graph, 4, 1);
        graph.addEdge(graph, 6, 4);
        graph.addEdge(graph, 5, 6);
        graph.addEdge(graph, 5, 2);
        graph.addEdge(graph, 6, 0);

        MotherVertex motherVertex = new MotherVertex(graph);

        int result = motherVertex.find();

        assertEquals(5, result);
    }
}