package org.milan.datastructure.graph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test class for {@link DisjointSet}
 *
 * @author Milan Rathod
 */
class DisjointSetTest {

    @Test
    void testIsCycleExists() {
        Graph graph = new Graph(3, GraphType.UNDIRECTED);

        graph.addEdge(graph, 0, 1);
        graph.addEdge(graph, 1, 2);
        graph.addEdge(graph, 0, 2);

        DisjointSet disjointSet = new DisjointSet();

        assertTrue(disjointSet.isCycleExists(graph));
    }
}